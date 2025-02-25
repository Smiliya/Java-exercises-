/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findhcfandlcm;

/**
 *
 * @author 1BSCCSB23
 */
public class FINDHCFANDLCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int a,b,x,y,t,hcf,lcm;
       x=6;
       y=10;
       a=x;
       b=y;
       while(b!=0)
       {
           t=b;
           b=a%b;
           a=t;
       }
       hcf=a;
       lcm=(x*y)/hcf;
       System.out.print("HCF and LCM of:"+x+"and "+y+"is:\n");
       System.out.print("HCF="+hcf);
       System.out.print("\n lcm="+lcm);
               
    }
    
}


output
HCF and LCM of:6and 10is:
HCF=2
 lcm=30BUILD SUCCESSFUL (total time: 0 seconds)
