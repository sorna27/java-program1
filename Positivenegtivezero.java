
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class Positivenegtivezero {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int c, pos=0,neg=0,zer=0;
        for(int i=0; i<n; i++)
        {
            c= obj.nextInt();
            if(c>0)
                pos++;
            else if (c<0)
                neg++;
            else
                zer++;
        }
        System.out.println(pos+"..."+neg+"..."+zer);        
   }
    }
