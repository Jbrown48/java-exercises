package org.launchcode.java.practice;

/**
 * Created by jarrett on 5/8/2017.
 */
public class Max {
        public static int arrayMax(int[] array) {

            int max = array[0];


            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }


            }
            return max;
        }
        public static void main(String[] args){
            int [] test = {5 , 6, 10, 15, 2};
            int answer = Max.arrayMax(test);
            System.out.println(answer);
        }

}
