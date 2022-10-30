package class14;

public class StringBufferVsBuilder {
    public static void main(String[] args) {

        //StringBufferVsBuilder  are the same, use the same method
        //Mostly used class newer better faster
        StringBuilder stringBuilder=new StringBuilder("Today is java class");

        //Older one slow and not used mostly
        StringBuffer stringBuffer=new StringBuffer("Today is java class");


        String str="Java is very easy";

        /*
        If we want to convert the String to a Stringbuilder we can use the below Syntax
         */
        StringBuilder stringBuilder1=new StringBuilder(str);
        System.out.println("stringBuilder1 = " + stringBuilder1);

        //convert stringBuilder1 to string
        /*
        if we want to convert from a StringBuilder to A String we can use the below syntax
         */
        String newStr=stringBuilder1.toString();

    }
}
