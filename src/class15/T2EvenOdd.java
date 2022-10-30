package class15;

public class T2EvenOdd {
    /*
    2.Create a method that will take a number and prints whether the number is even or odd.
     */
     //Keyword "Print" => using void

    void printEvenOdd(int number){
        if(number%2==0){
            System.out.println(number+" is Even");
        }else {
            System.out.println(number+" is Odd");
        }
    }
    public static void main(String[] args) {
        T2EvenOdd task=new T2EvenOdd();
        task.printEvenOdd(45);
        task.printEvenOdd(50);
    }
}
