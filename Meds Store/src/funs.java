import java.util.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.*;
import java.time.LocalDateTime;  
import java.sql.Date;
import java.lang.Math;   
//import java.time.format.DateTimeFormatter; 
public class funs {
  static Connection c=CP.createC();
   static User_db b1=new User_db();
       static User_db extract(User_db b1,String id)
       {  
           try{
               ResultSet rs=null;
               Statement psmt;
          
           String q="select * from user_details where uid="+id;
           psmt=c.createStatement();
           //extract
           rs=psmt.executeQuery(q);
           rs.next();  
          b1.u_id=Integer.toString(rs.getInt(1));
         b1.u_p=rs.getString(2);
         b1.nick_name=rs.getString(5);
         b1.address=rs.getString(3);
         b1.phone=rs.getString(4);
         
         
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           return b1;
       }
       
       static User_db extract(String id)
       {  
           try{
               ResultSet rs=null;
               Statement psmt;
          
           String q="select * from user_details where uid="+id;
           psmt=c.createStatement();
           //extract
           rs=psmt.executeQuery(q);
           rs.next();  
          b1.u_id=Integer.toString(rs.getInt(1));
         b1.u_p=rs.getString(2);
         b1.nick_name=rs.getString(5);
         b1.address=rs.getString(3);
         b1.phone=rs.getString(4);
         
         
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           return b1;
       }
       
       static String db_extract_pin(String id)
       {  String pin;
           try
           {
               
               Statement psmt;
               ResultSet rs=null;
           String q="select pin from user_details where uid="+id;
           psmt=c.createStatement();
           //extract
          rs=psmt.executeQuery(q);
          rs.next();
          pin=rs.getString(1);
           }
           
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           
           return pin;
       }
       
       static int db_change_pin(String id,String pin)
       {
           try{
             
               PreparedStatement psmt;
          
           String q="update user_details set pin="+pin+" where uid="+id;
           psmt=c.prepareStatement(q);
           
           psmt.executeUpdate();       
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return 0;
               
           }
           return 1;
           
       }
       
       static int db_change_info(String id,String add,String ph)
       {
           try{
             
               PreparedStatement psmt;
          
           String q="update user_details set address='"+add+"', phone='"+ph+"' where uid="+id;
           System.out.println(q);
           psmt=c.prepareStatement(q);
           
           psmt.executeUpdate();       
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return 0;
               
           }
           return 1;
           
       }
       
       
       
       //MEDS_DB
       static Meds_db m1=new Meds_db();
       static Meds_db extract_medsdb()
       {  
           try{
               ResultSet rs=null;
               Statement psmt;
          
           String q="select * from meds_details";
           psmt=c.createStatement();
           //extract
           rs=psmt.executeQuery(q);
          int i=0;
           while(rs.next()){
          m1.id[i]=rs.getInt(1);
         m1.name[i]=rs.getString(2);
         m1.price[i]=rs.getDouble(6);
         Home.change(m1.price[i]);
         m1.quantity[i++]=rs.getInt(7);
           }
         
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           return m1;
       }
       
       
       //Order_db
       static Order_db o1=new Order_db();
       
       static int insert_db(Order_db o1)
       {
           try{
               
               PreparedStatement psmt;
               
          
           String q;
          // if(o1!=null){
           q="delete from order_details where uid="+o1.u_id;
              psmt=c.prepareStatement(q);
              psmt.executeUpdate();
          // }
           int i=0;
           while(i<6){
               if(o1.items_count==0){
                   break;
               
               }
              if(o1.quantity[i]==0)
              {
                  i++;
                  continue;
              }
             
               q="insert into order_details values(?,?,?,?,?)";
           psmt=c.prepareStatement(q);
           //set params
           psmt.setInt(1,Integer.parseInt(o1.u_id));
          // psmt.setInt(2,o1.oid);
           psmt.setInt(2,o1.id[i]);
           psmt.setString(3, o1.name[i]);
           psmt.setInt(4, o1.quantity[i]);
           psmt.setDouble(5, o1.price[i++]);
           psmt.executeUpdate();
           }
          }
         
           catch(Exception e)
           {
               e.printStackTrace();
               return 0;
           }
           return 1;
       }
       
       static Order_db extract_orderdb(String id)
       {  
           try{
               ResultSet rs=null;
               Statement psmt;
          
           String q="select * from order_details where uid="+id;
           psmt=c.createStatement();
           //extract
           rs=psmt.executeQuery(q);
           
           if(rs.next()==false)
               return null;
           rs=psmt.executeQuery(q);
          int i=0;
          o1.items_count=0;
          o1.cost=0;
           while(rs.next()){
               i=rs.getInt(2)-1;
          o1.id[i]=rs.getInt(2);
         o1.name[i]=rs.getString(3);
         o1.price[i]=rs.getDouble(5);
         o1.quantity[i]=rs.getInt(4);
         o1.items_count+=o1.quantity[i];
         o1.cost+=o1.price[i];
         //System.out.println(id+" "+i+" "+o1.name[i]+" "+o1.id[i]+" "+o1.quantity[i]);
         
           }
         //System.out.println(o1.quantity[i]);
         o1.cost=Home.change(o1.cost);
           }
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           return o1;
       }
       
       static Order_history oh1=new Order_history();
       static Order_history extract_history(Order_history oh1,String id)
       {
           try
           {
               ResultSet rs=null;
               Statement psmt;
               
           String q="select * from order_history where uid="+id;
           psmt=c.createStatement();
           //extract
            rs=psmt.executeQuery(q);
           
           if(rs.next()==false)
               return null;
           rs=psmt.executeQuery(q);
           int i=0;
           while(rs.next())
           {
               oh1.oid[i]=rs.getString(2);
               oh1.date[i]=rs.getDate(4).toString();
               oh1.cost[i]=rs.getDouble(3);
               Home.change(oh1.cost[i]);
               i++;
           }
           
           }
           
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           
           return oh1;
       }
       
       static int order_history_db(Order_db o1)
       {
          try
          {
              PreparedStatement psmt;
              String q="insert into order_history values(?,?,?,?)";
              psmt=c.prepareStatement(q);    
                  
                
               psmt=c.prepareStatement(q);
           //set params
           psmt.setInt(1,Integer.parseInt(o1.u_id));
           psmt.setString(2,o1.oid);
           Home.change(o1.cost);
           psmt.setDouble(3,o1.cost);
           psmt.setDate(4,Date.valueOf(java.time.LocalDate.now()));
           
           psmt.executeUpdate();
              
          }
          
          catch(Exception e)
          {
              e.printStackTrace();
              return 0;
          }
          
          return 1;
       }
       
       static int insert_placed_order(Order_db o1)
       {
           try{
                PreparedStatement psmt;
              String q="select oid from placed_order ORDER BY oid DESC LIMIT 1;";
              psmt=c.prepareStatement(q); 
              ResultSet rs=psmt.executeQuery();
              if(rs.next()==false){
               o1.oid=Date.valueOf(java.time.LocalDate.now()).toString();
              o1.oid=o1.oid.replaceAll("[^a-zA-Z0-9]", "");
              }
              else{
                  rs=psmt.executeQuery();
                  rs.next();
                  o1.oid=rs.getString(1);
              }
               long oid=Long.parseLong(o1.oid)+1;
              o1.oid=Long.toString(oid);
              
              int i=0;
              while(i<6)
              { if(o1.quantity[i]==0)
                 {  i++;
                 continue;
                  }
              q="insert into placed_order values(?,?,?,?,?)";
              psmt=c.prepareStatement(q); 
              psmt.setString(1,o1.u_id);
              psmt.setString(2,o1.oid);
           psmt.setString(3,o1.name[i]);
           psmt.setInt(4,o1.quantity[i]);
           psmt.setDouble(5,o1.price[i]);
           psmt.executeUpdate();
           i++;
          }
         }
           
           catch(Exception e)
           {
               e.printStackTrace();
               return 0;
           }
           return 1;
       }
       
       static Order_db extract_placed_order(Order_db o1,String oid)
       {  
           
           try
           {
               Statement psmt;
               String q="select * from placed_order where uid="+o1.u_id+" and oid="+oid;
               System.out.println(o1.oid+" "+oid);
               psmt=c.createStatement();
               
               ResultSet rs=psmt.executeQuery(q);
               
               if(rs.next()==false)
                   return null;
               rs=psmt.executeQuery(q);
               int i=0;
               o1.oid=oid;
               while(rs.next())
               {
                   o1.name[i]=rs.getString(3);
                   o1.quantity[i]=rs.getInt(4);
                   o1.price[i++]=rs.getDouble(5);
               }
           }
           
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           
           return o1;
       }
       
       static int insert_track_order(String uid,String oid)
       {
           try{
                PreparedStatement psmt;
              
           
              //ResultSet rs=psmt.executeQuery();
          
              
              int days=(int)(Math.random()*(12-2+1)+2); 
           
             String q="insert into order_status values(?,?,?,?)";
              psmt=c.prepareStatement(q); 
              psmt.setString(1,uid);
              psmt.setString(2,oid);
           psmt.setString(3,"Not-Delivered");
           psmt.setDate(4,Date.valueOf(java.time.LocalDate.now().plusDays(days)));
          
           psmt.executeUpdate();
          
          
         }
           
           catch(Exception e)
           {
               e.printStackTrace();
               return 0;
           }
           return 1;
       }
       
       static track_order extract_track_order(track_order to1)
       {  
           
           try
           {
               Statement psmt;
               String q="select * from order_status where uid="+to1.u_id;
             //  System.out.println(oh1.oid+" "+oid);
               psmt=c.createStatement();
               
               ResultSet rs=psmt.executeQuery(q);
               
               if(rs.next()==false)
                   return null;
               rs=psmt.executeQuery(q);
               int i=0;
               
               while(rs.next())
               {  
                   to1.oid[i]=rs.getString(2);
                   to1.status[i]=rs.getString(3);
                   to1.date[i++]=rs.getDate(4).toString();
                  
               }
           }
           
           catch(Exception e)
           {
               e.printStackTrace();
               return null;
           }
           
           return to1;
       }
  
}