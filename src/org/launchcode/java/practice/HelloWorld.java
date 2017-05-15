package org.launchcode.java.practice;

import java.util.Scanner;

/**
 * Created by jarrett on 5/8/2017.
 */
public class HelloWorld {
    public static void main(String[] args) {
        //write code in here that you want to execute
        String name;
        Scanner in;

        in = new Scanner (System.in);

        System.out.println("What is your name?");
        name = in.next();

        System.out.println("Hello " + name + "!");
    }
}
