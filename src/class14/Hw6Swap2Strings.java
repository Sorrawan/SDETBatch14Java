package class14;

public class Hw6Swap2Strings {
    public static void main(String[] args) {
        /*
        How would you swap  2 strings without a temporary variable?
         */

        String str1="python";
        String str2="Java";

        str1=str1+str2;    //pythonJava
        str2=str1.replace(str2,"");    //python
        str1=str1.replace(str2,"");    //Java
        System.out.println(str1);     //str1= Java
        System.out.println(str2);     //str2= python
    }
}
