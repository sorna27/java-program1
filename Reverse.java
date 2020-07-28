
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
public class Reverse {
    public static void main(String[]args){
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        int a[]=new int[10];
        for(int i=0; i<n; i++)
        {
            a[i]=obj.nextInt();
        }
        for(int i=n-1; i>=0; i--)
        {
            System.out.println(a[i]);
        }
    }
}

