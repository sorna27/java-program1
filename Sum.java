
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
public class Sum {
    public static void main(String[]args){
        int i,n,sum=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the limit");
        n=obj.nextInt();
        for( i=0;i<n;i++)
        {
            sum=sum+obj.nextInt();
        }
        System.out.println("The sum of numbers"+sum);
    }
}

