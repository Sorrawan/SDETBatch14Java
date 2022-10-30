package class14;

public class T3StringIsPalindrome {
    /*
    3.Create a method that will print whether given String is palindrome or not.
     */
void palin(String word){
    StringBuilder stringBuilder=new StringBuilder(word);   //reverse String to StringBuilder first
    stringBuilder.reverse();
    if(stringBuilder.toString().equals(word)){     // reverse StringBuilder back to String
        System.out.println(word+" is Palindrome");
    }else{
        System.out.println(word+" is not Palindrome");
}

    }

    public static void main(String[] args) {
        T3StringIsPalindrome givenum=new T3StringIsPalindrome();
        givenum.palin("pop");
    }
}
