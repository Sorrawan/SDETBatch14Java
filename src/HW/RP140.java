package HW;

public class RP140 {
    /*
    Create the maxLength method that will accept String array of words and return the word with the largest length.
Method should visible only within same package!

**Expected Output:**

```
this is long
```
     */
    static String maxLength(String[] array){
        String largestString= array[0];
        for(int i=1;i<array.length;i++){
            if(largestString.length()<array[i].length()){
                largestString=array[i];
            }
        }
        return largestString;
    }

    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }

}
