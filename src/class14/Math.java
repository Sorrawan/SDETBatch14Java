package class14;

public class Math {
void add(int num1,int num2){
    System.out.println(num1+num2);
}
    void printFiboSeries(int size){

        int previous=0;
        int currentNumber=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNumber);
        for(int i=0; i<size;i++) {
            nextNum=previous+currentNumber;
            System.out.println(nextNum);
            previous=currentNumber;
            currentNumber=nextNum;
        }
    }

    public static void main(String[] args) {
        Math obj=new Math(); // Creating an object of the Math class
        obj.printFiboSeries(5);  //This is how we execute the logic present inside the method

        System.out.println("**************************");

        obj.printFiboSeries(10);

        System.out.println("**************************");

        //want to add 2 numbers
        obj.add(10,20);     //30

    }

}
