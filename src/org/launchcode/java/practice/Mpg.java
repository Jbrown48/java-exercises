package org.launchcode.java.practice;

import java.util.Scanner;

/**
 * Created by jarrett on 5/8/2017.
 */
public class Mpg {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Miles driven: ");
        int miles = in.nextInt();

        System.out.println("Gallons of gas used: ");
        double gallons = in.nextDouble();

        double mpg = miles / gallons;

        System.out.println("Driving "+ miles +" on "+gallons+" gallons of gas equals " +mpg + " MPG!");
    }
}
