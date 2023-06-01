


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
import java.sql.Connection;
public class User_db {
   
    String u_id;
   String u_p;
   String nick_name;
   String address,phone;
   
   void extract_data()
   {
       funs.extract(this,this.u_id);
       
   }
   int check_creds(){
       //User_db b1=new User_db();
       
       String p=funs.db_extract_pin(this.u_id);
     //  System.out.println(this.u_p+" "+b1.u_p);
       if(p==null)
           return 0;
   
       if(!this.u_p.equals(p))
           return 0;
       
     
           return 1;
   }
   
     int check_creds(int forgot){
       User_db b1=new User_db();
       
       b1=funs.extract(this.u_id);
       if(b1==null)
           return 0;
     
       this.u_p=b1.u_p;
       this.nick_name=b1.nick_name;
       
    
           return 1;
   }
     
     int change_pin(String pin){
         int e=funs.db_change_pin(this.u_id,pin);
         
         if(e==1){
          this.u_p=pin;
             return 1;
         }
         return 0;
     }
     
     void extract_pin()
     {
         this.u_p=funs.db_extract_pin(this.u_id);
         return;
     }
     
     int change_info(String add,String ph)
     {
         int e=funs.db_change_info(this.u_id,add,ph);
         if(e==1){
             this.address=add;
             this.phone=ph;
             return 1;
         }
         
         return 0;
     }
}
