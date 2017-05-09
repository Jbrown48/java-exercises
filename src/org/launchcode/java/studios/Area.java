package org.launchcode.java.studios;

/**
 * Created by jarrett on 5/8/2017.
 */

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        double userNum;
        double area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("Please provide the radius of the cirlce.");
        userNum = in.nextDouble();

        while (userNum <= 0) {
            System.out.println("Please provide the radius of the cirlce.");
            userNum = in.nextDouble();
        }

        //area of a circle is A = pi * r * r where pi is 3.14 and r is the radius.

        area = (3.14 * userNum * userNum);
        System.out.println(area);


    }
}
