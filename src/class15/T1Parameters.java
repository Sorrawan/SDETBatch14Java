package class15;

import java.util.Scanner;

public class T1Parameters {
    /*
    1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */

    //Normal solved+Using Scanner

    void printLarger(int num1,int num2){
        if(num1>num2){
            System.out.println("Number1 is larger "+num1);
        } else if (num2>num1) {
            System.out.println("Number2 is larger "+num2);
        }else {
            System.out.println("Numbers are equals");
        }
    }
    public static void main(String[] args) {

        //Using Scanner
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Enter the first Number");
        int number1=scanner.nextInt();    //we can call them anything like number
        System.out.println("Please Enter the Second Number");
        int number2=scanner.nextInt();
        T1Parameters task1=new T1Parameters();
        task1.printLarger(number1,number2);

//แบบปกติ ไม่ใช้Scanner
        task1.printLarger(50,12);
    }
}
