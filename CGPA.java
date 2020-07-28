
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
public class CGPA {
    public static void main(String[]args){
        Scanner obj = new Scanner(System.in);
        double m[]=new double[10];
        double c[]= new double [10];
        double sum =0,cs=0;
        int i;
        System.out.println("Enter no. of subjects");
        int n=obj.nextInt();
        for (i=0;i<n;i++)
        {
            System.out.println("Enter grade and credit for"+(i+1)+"Subject");
            m[i]=obj.nextDouble();
            c[i]=obj.nextDouble();
            sum=sum+m[i]*c[i];
            cs= cs+c[i];
        }
        System.out.println("CGPA..."+(sum/cs));
                }              
        }
        
  
    
