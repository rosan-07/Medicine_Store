/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Order_db {
    String[] name=new String[10];
    int[] quantity= new int [10];
    double[] price=new double[10];
    String u_id;
    int items_count;
    String oid;
    int[] id=new int[10];
    double cost;
   
    
    Order_db()
    {
//        quantity[0]=0;
//        quantity[1]=0;
    }
    
    Order_db extract_order()
    {
        Order_db o1=funs.extract_orderdb(this.u_id);
       
        return o1;
//        if(o1==null)
//            return 0;
//        for(int i=0;i<6;i++)
//        {
//            this.name[i]=o1.name[i];
//            this.id[i]=o1.id[i];
//            this.quantity[i]=o1.quantity[i];
//            this.price[i]=o1.price[i];
//              //System.out.println(this.quantity[i]);
//        }
//        return 1;
    }
    
    int insert_order()
    {  
        int i=0;
      
        int e=funs.insert_db(this);
        if(e==1)
            return e;
        
            return 0;
    }
    
    int add_order()
    {
        int e=funs.order_history_db(this);
        if(e==1)
            return e;
        
            return 0;
    }
}
