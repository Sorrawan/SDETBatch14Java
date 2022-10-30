package class14;

public class Hw2Combination {
    public static void main(String[] args) {

        /*
        2.Create a String that should be combination of letters, numbers and special characters.
        Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
         */

        String str="SsdfgDGGGGGGGRGRGER12445^%%&&";
        str=str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str = " + str);   //SsdfgDGGGGGGGRGRGER12445
        System.out.println(str.length());     //24





    }
}
