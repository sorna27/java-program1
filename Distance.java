/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meena
 */
public class Distance {
    public static void main (String[]args)
    {
        int x1=3, x2=4,y1=7,y2=9;
        double distance= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)* (y2-y1));
        System.out.print(distance);
    }
}
