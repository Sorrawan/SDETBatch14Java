package class24;

import java.util.ArrayList;
import java.util.Arrays;

public class WhyCollectionFramework {
    public static void main(String[] args) {
        /*
        If we have to store a single value we should use variables
         */
        String name="Josh";
        String name2="Joe";
        System.out.println(name);
        System.out.println(name2);

        /*
        If we have to store more than 2 values of same kind then we should go with "Array"
         */
        String[]  names={"REchard","Adam","Joey"};

        /*
        DisAdvantage of using Array
        1. Fixed in size so you must know beforehand how much data you will store
        2.
         */

        String[] breeds=new String[10];    // <= Create the array of size 10
        breeds[0]="Bulldog";                // we have only 1 data out of 10 for now
        System.out.println(Arrays.toString(breeds));   // to print out all String in []
        //Then we will get [Bulldog,null,null,null,null,null,null,null,null,null] becuz it reserves space for 10 variables



        //How to create ArrayList
        ArrayList<String> colors=new ArrayList<>();     // Bcuz we want to store String then "<String>"
        colors.add("Green");
        colors.add("Red");
        System.out.println(colors.contains("Green"));  //true
        System.out.println(colors);   // Then we will get [Green,Red]  => No reserve space like the code above
    }
}
