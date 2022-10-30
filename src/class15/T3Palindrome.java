package class15;

public class T3Palindrome {
    /*
        3.Create a method that will print whether given String is palindrome or not.
         */

    void printPalindrome(String str){
        str=str.toLowerCase();   //to convert all letter to be lower case
        StringBuilder stringBuilder=new StringBuilder(str);   //reverse String to StringBuilder first
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){     // reverse StringBuilder back to String
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not Palindrome");
        }
    }
    public static void main(String[] args) {
        T3Palindrome task=new T3Palindrome();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");
    }
}
