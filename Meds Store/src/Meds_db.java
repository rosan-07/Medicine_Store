/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KIIT
 */
public class Meds_db {
    String[] name=new String[10];
    int[] quantity=new int[10];
    double[] price=new double[10];
    int[] id=new int[10];
    
    Meds_db()
    {
//        quantity[0]=10;
//        price[0]=100.0;
//        quantity[1]=3;
//        price[1]=150.0;
    }
    
    Meds_db extract_meds()
    { 
        Meds_db m1=funs.extract_medsdb();
        return m1;
//        if(m1==null)
//            return 0;
//        
//        for(int i=0;i<6;i++)
//        {
//            this.name[i]=m1.name[i];
//            this.quantity[i]=m1.quantity[i];
//            this.price[i]=m1.price[i];
//            this.id[i]=m1.id[i];
//            
//            //System.out.println(this.id[i]+" "+this.name[i]+" "+this.price[i]+" "+this.quantity[i]);
//        }
//        
//        return 1;
        
    }
}
