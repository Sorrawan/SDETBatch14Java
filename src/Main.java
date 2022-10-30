public class Main {
    public static void main(String[] args) {


        //StringBuilder help build String quickly
        //Good when you don't care about the memory, will keep create the content
        // even it is the same variable, Need Speed


       // StringBuilder  allows any methods to change the original contents of the variables
        //because StringBuilder is mutable.

        StringBuilder stringBuilder=new StringBuilder("Intellij is Great");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

        /*
        String does not allow any method to change the original contents of the variables
        because String is immutable.
        */

        String str="Intellij";
        str.toLowerCase();
        System.out.println(str);


        /*
        String country="USA";
        String home="USA";
        StringBuilder state=new StringBuilder("New york");
        StringBuilder state2=new StringBuilder("New york");
         */

    }

}