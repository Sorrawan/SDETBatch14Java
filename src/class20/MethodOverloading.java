package class20;

import java.util.Scanner;

public class MethodOverloading {

    // Java allow us to use the same method name with almost all type of data

    int number;
    double dNumber;

    MethodOverloading() {
    }

    MethodOverloading(double dNumber){
        this.dNumber=dNumber;
    }

    MethodOverloading(int number){
        this.number=number;
    }

    static void add(int num1, int num2){
        System.out.println(num1+num2);
    }
static void add(double num1,double num2){
    System.out.println(num1+num2);
}
    static void add(double num1,double num2,double num3){
        System.out.println(num1+num2+num3);
    }


    public static void main(String[] args) {
        add(20,20);    //int,int   then JAva will ignore the less when it found the perfect match.
        new MethodOverloading(45);
        new Scanner(System.in);
    }
}
