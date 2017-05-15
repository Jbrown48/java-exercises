package org.launchcode.java.studios;

/**
 * Created by jarrett on 5/8/2017.
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Please provide the radius of the cirlce.");
        double userNum = in.nextDouble();

        while (userNum <= 0) {
            //Called a sentinal
            System.out.println("Please provide the radius of the cirlce.");
            userNum = in.nextDouble();
        }

        //area of a circle is A = pi * r * r where pi is 3.14 and r is the radius.

        double area = (Math.PI * userNum * userNum);
        System.out.println("The area of the circle with radius " + userNum + " is " + area);


    }
}
