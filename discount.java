
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
public class discount {
    public static void main( String[]args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the amout");
        double d= obj.nextDouble();
        System.out.println("Enter the discount %");
        double d1= obj.nextDouble();
        double amoper=d/100*d1;
        System.out.println("Commission amount"+(d-amoper));
    }
}
