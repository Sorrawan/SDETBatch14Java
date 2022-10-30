package class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {

        //Only want Letter in my text
        String str="e9fjoiDRGJLopoi49868745$^$#Y^$^U#@!";
        str=str.replaceAll("[^a-zA-Z]","");  //Replace all bot NOT a-z and A-Z
        System.out.println("str = " + str);     //efjoiDRGJLopoiYU

        //Want to split String
        String sentence="Batch 14 is Great. batch 14 is excellent! Batch 14 is just amazing";
        String[] split = sentence.split("[.!]");     // so . and ! will be ignored
        System.out.println("split = " + Arrays.toString(split));

        //Want to replace only 1st Great
        String str2="Batch14 is Great.Batch14 is Great.";
        String replace= str2.replaceFirst("Great","Good");
        System.out.println(replace);


    }
}
