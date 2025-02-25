/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversenum;

/**
 *
 * @author 1BSCCSB23
 */
public class ReverseNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int rev=0;
        int num=1234;
        int no=num;
        while(num>0)
        {
            int rem=num%10;
            rev=rem+(rev*10);
            num=num/10;
        
        }
           System.out.println("Number="+no);
           System.out.println("Reverse="+rev);
    }
    
}


  output
Number=1234
Reverse=4321
BUILD SUCCESSFUL (total time: 0 seconds)
