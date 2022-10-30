package class24;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        //Syntax to create an arrayList
        ArrayList<String> colors=new ArrayList<>();
        //Add Element to the Array
        //Use "add method" to insert elements in an arrayList
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Black");
        System.out.println(colors);
       // colors.remove("Blue");            // Remove by its valuable
         colors.remove(2);             //Or remove by index
        System.out.println(colors);      //[Red, Green, Yellow, Black]
    }
}
