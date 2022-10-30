package class14;

public class T2EvenOrOdd {
    /*
    2.Create a method that will take a number and prints whether the number is even or odd.
     */

    void evenOrOdd(int num1){
        if(num1%2==0){
            System.out.println(num1+" is Even number");
        }else{
            System.out.println(num1+" is Odd number");
        }
    }


    public static void main(String[] args) {
        T2EvenOrOdd findNum=new T2EvenOrOdd();
        findNum.evenOrOdd(4);
    }
}
