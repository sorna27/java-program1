/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class Fibonacci {
    public static void main(String[]args){
        int a=0;
        int b= 1,c;
                System.out.println(a);
                System.out.println(b);
                for(int i=0; i<10; i++)
                {
                    c=a+b;
                    a=b;
                    b=c;
                    System.out.println(c);
                }
    }
}

                
    
