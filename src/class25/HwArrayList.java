package class25;

import java.util.ArrayList;

public class HwArrayList {
    public static void main(String[] args) {

         /*
    Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
     */
        ArrayList<String> names=new ArrayList<>(); // we can pass the number into instructor if we know the size/no. of elements
        names.add("Jam");
        names.add("Jamo");
        names.add("Kami");
        names.add("Chacha");
        names.add("Tookta");

        System.out.println(names.isEmpty());  //the given ArrayList is empty or not?
        System.out.println(names.contains("Jam"));
        System.out.println(names.contains("Dan"));
        System.out.println(names.size());
        System.out.println(names);




    }
}
