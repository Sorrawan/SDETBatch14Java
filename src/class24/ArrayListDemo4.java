package class24;

import java.util.ArrayList;

public class ArrayListDemo4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Tymur");
        names.add("Sulma");
        names.add("MJ");
        names.add("Josh");

        // names.add(0,"Josh Again");   //Then= [Josh Again, Tymur, Sulma, MJ, Josh] "Josh"will be move to Index 0

        //Use "set"  to replace
        // names.set(2,"Josh Again");    // Then it will replace "MJ"  with "Josh Again"  => [Tymur, Sulma, Josh Again, Josh]
        System.out.println(names);

        ArrayList<Integer>  numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(35);
        numbers.add(1,100);  //Then [10, 100, 25, 35]  **** Add in
        numbers.set(0,12000);              //[12000, 100, 25, 35]    ****Replace
        System.out.println(numbers);

        numbers.clear();   //delete all the elements from the list
        System.out.println(numbers);    //[]
    }
}
