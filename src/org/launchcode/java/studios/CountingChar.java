package org.launchcode.java.studios;

import java.util.HashMap;

/**
 * Created by jarrett on 5/11/2017.
 */
public class CountingChar {

    public static String removePunctuations(String s) {
        String res = "";
        for (Character c : s.toCharArray()) {
            if(Character.isLetter(c)) {
                res += c;
            }else if(c.equals(' ')){
                res+=c;
            }
        }
        return res;
    }
    public static void main(String[] args){

        String myString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                "Nunc accumsan sem ut ligula scelerisque sollicitudin. Ut at sagittis augue. " +
                "Praesent quis rhoncus justo. Aliquam erat volutpat. Donec sit amet suscipit metus, " +
                "non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, volutpat eget massa. " +
                "Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> counts = new HashMap<Character, Integer>();

        //System.out.println(removePunctuations(myString));

        char[] charactersInString = myString.toCharArray();
        for (Character c : charactersInString){
            if(!counts.containsKey(c)){
                counts.put(c,1);

            }else {//c is in hash map
                int x = counts.get(c);
                counts.put(c,x+1);
            }
        }
        for (Character c : counts.keySet()){
            System.out.println(c + " : " + counts.get(c));
        }

        }
}
