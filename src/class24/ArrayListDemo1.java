package class24;

import java.util.ArrayList;

public class ArrayListDemo1 {
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

        //Print all the elements
        System.out.println(colors);             //[Red, Green, Blue, Yellow, Black]

        //Get method prints individuals elements from arrayList
        System.out.println(colors.get(0));      // 0= index    // Red
        System.out.println(colors.get(2));      // Blue

        //Size
        System.out.println(colors.size());      //To know the no.Element


        System.out.println("+++++++++++++++++++++++Using For loop+++++++++++++++++++++++");
//Using  for loop to Get the element one by one
        for (int i = 0; i < colors.size(); i++) {             //
            System.out.println(colors.get(i));    //to Get the element one by one
        }

        System.out.println("+++++++++++++++++++++++Using Enhanced for loop+++++++++++++++++++++++");

        //Using Enhanced for loop to Get the element one by one
        for(String color:colors){
            System.out.println(color);
        }



    }

}
