
import static java.time.Clock.system;
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
public class perimeter {
    public static void main(String [] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the side of square");
        int a=obj.nextInt();
        System.out.println("perimeter="+(4*a));
    }
    
}
