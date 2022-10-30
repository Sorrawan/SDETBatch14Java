package class17;

//Related to Task1Tester
public class Task1ArrayAsParameters {
    /*
    Create a method that will accept an array as parameters and will return a sum of all elements from that array.
    Method should be visibly only within same package and accessible by the creating an instance of the class.
     */

    int sumArray(int [] arr){   // (int [] arr) => so we can put info in the array as an Integer
        int sum=0;
        for(int num:arr ){
            sum+=num;
        }
        return sum;

    }

}
