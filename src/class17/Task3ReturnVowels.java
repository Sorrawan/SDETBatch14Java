package class17;

public class Task3ReturnVowels {
    /*
    Create a method that will accept a String as a parameter and return a new String that consist only of vowels.
    Method should be available inside the class only where it was declared and executed by calling it is name.
     */

    private static String getVowels(String str){

        //First way
       /*
       String newStr=str.replaceAll("[^aeiouAEIOU]","");
       return newStr;
        */

        //Second way
        return str.replaceAll("[^aeiouAEIOU]","");
    }

    public static void main(String[] args) {

        System.out.println(getVowels("Hemera") );
    }
}
