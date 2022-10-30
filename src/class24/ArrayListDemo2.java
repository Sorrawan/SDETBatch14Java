package class24;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        //Ex.
        //int => Integer
        //boolean => Boolean
        //byte => Byte
        //double => Double
        //long => Long
        //float => Float
        //char => Character

        ArrayList<Integer> numbers=new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(35);

        int a=34;
        numbers.add(a);
        System.out.println(numbers);   // then JAva will add "34" into Numbers Array as well


        System.out.println("+++++++++++++++++++++++Using Enhanced for loop+++++++++++++++++++++++");
        //Using Enhanced for loop to Get the element one by one
        for (Integer num:numbers) {
            System.out.println(num);
        }
    }
}
