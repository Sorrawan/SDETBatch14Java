package class14;

public class Hw5Palindrome {
    public static void main(String[] args) {
        /*
             How would you check if String is palindrome or not? aba=> true Abbc =>false
         */

        String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);   //reverse String to StringBuilder first
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){     // reverse StringBuilder back to String
            System.out.println("The String is Palindrome");
        }else{
            System.out.println("The String is not Palindrome");
        }
    }
}
