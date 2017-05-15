package org.launchcode.java.practice;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by jarrett on 5/11/2017.
 */
public class DoubleListAdd {
    public static ArrayList<Integer> addNumbers (ArrayList<Integer> a, ArrayList<Integer> b) {

        ArrayList<Integer> bigger = a;
        ArrayList<Integer> smaller = b;
        //find out which is bigger
        if (a.size() < b.size()){
            bigger = b;
            smaller = a;
        }
        //create a new array list that holds the results
        ArrayList<Integer> result = new ArrayList<Integer>();

        //for each index in larger list
        for (int i = 0; i < bigger.size();i++){
            if (i < smaller.size()){
                result.add(smaller.get(i) + bigger.get(i));
            }else{
                result.add(bigger.get(i));
            }

        }
            //if index exists in smaller list
                //add values, store in result
            //else
                //put value from the alrger list in result

        //return result
        return result;

    }

    public static void main(String[] args){

        Integer[] list1 = new Integer[]{3,4,5,1};
        Integer[] list2 = new Integer[]{1,6};

        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(list1));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(list2));

        ArrayList<Integer> combine = addNumbers(a,b);

        for (int num : combine){
            System.out.print(num+" ");
        }
    }
}
