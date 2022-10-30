package HW;

public class RP139 {
    /*
    Create a method that will be available to all classes in your project with following specifications:

Returns:

```
a String
```

Name:

```
alphabetical
```

Parameters:

```
a String called str
```

Purpose:

```
Return a string that is composed of each letter as long as the letter is later on in the alphabet
```

```
than its previous one.  You can assume actual parameters are lowercase.
See below examples.
```

Additional Info:

You can use < and > to compare characters (not Strings), where characters later on in the alphabet are "greater".  Examples:

```
'a' < 'b' ==> True
```

```
'a' < 'a' ==> False
```

```
'a' > 'b' ==> False
```

Examples:

```
alphabetical("hello") ==> "hlo"
```

```
alphabetical("software") ==> "stwr"
```

```
alphabetical("language") ==> "lnug"
```

**Expected Output:**

```
hlo
stwr
lnug
```
     */

    public static String alphabetical(String str){
String newString= "";
newString = newString+str.charAt(0);
        for (int i = 1; i < str.length(); i++) { // i=1 bcuz we alreay grab the 1st letter => " newString = newString+str.charAt(0);"
            if(str.charAt(i)>str.charAt(i-1)){
                newString=newString+str.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println(alphabetical("hello"));
        System.out.println(alphabetical("software"));
        System.out.println(alphabetical("language"));
    }
}
