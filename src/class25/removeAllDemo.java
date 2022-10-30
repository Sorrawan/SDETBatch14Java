package class25;

import java.util.ArrayList;

public class removeAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLiner");
        makeUpItem.add("lipstick");



        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");

        makeUpItem.removeAll(itemsToBeRemoved);

        // makeUpItem.clear();   // everything will be removed
        System.out.println(makeUpItem);
    }
}
