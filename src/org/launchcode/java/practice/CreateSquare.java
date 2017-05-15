package org.launchcode.java.practice;
import java.util.Scanner;
/**
 * Created by jarrett on 5/8/2017.
 */
public class CreateSquare {
    public static void main(String[] args){

    Scanner in;
    Integer width;
    Integer length;
    Integer area;

    in = new Scanner(System.in);

    System.out.println("What is the width?");
    width = in.nextInt();

    while (width < 0){
        System.out.println("What is the width?");
        width = in.nextInt();
    }

    System.out.println("What is the length?");
    length = in.nextInt();

     while (length < 0){
        System.out.println("What is the length?");
        length = in.nextInt();
    }

    area = length * width;
     System.out.println("The area is: " + area);
    }
}
