/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class Power {
    public static void main(String[]args)
    {
        int n=3, p=2,sum=1;
        for(int i=0;i<p; i++)
        {
            sum=sum*n;
        }
        System.out.println("power of"+n+"^"+p+"...."+sum);
    }
}
