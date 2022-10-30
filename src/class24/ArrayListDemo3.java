package class24;

import java.util.ArrayList;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        ArrayList<Character> chars=new ArrayList<>();
        chars.add('A');
        chars.add('B');
        chars.add('C');
        chars.add('Z');
        chars.add('G');

        System.out.println(chars);    //[A, B, C, Z, G]


        ArrayList<Boolean> booleans=new ArrayList<>();
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        System.out.println(booleans);    //[false, false, true]

        ArrayList<Float> floats= new ArrayList<>();
        floats.add(12.5f);
        floats.add(12f);
        System.out.println(floats);    //[12.5, 12.0]


    }
}
