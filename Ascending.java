
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
public class Ascending {
    public static void main(String[]args){
        int a[]=new int[20];
        int n,temp;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter length");
        n=obj.nextInt();
        System.out.println("Enter..."+n+".....Elements");
        for(int i=0; i<n; i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n;j++)
            {
                if(a[i]>a[j])
                {temp=a[i];
                a[i]=a[j];
                a[j]=temp;}
            }
        }
        System.out.println("sorted elements");
        for(int i=0; i<n; i++)
        {
            System.out.println(a[i]);
        }
    }
}

