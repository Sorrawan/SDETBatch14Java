package class14;

public class T1ParametersAsNumbers {
    /*
    1.Create a method that will take 2 parameters as a numbers and prints which number is larger.
     */

void findLargest(int num1,int num2){
    if(num1>num2){
        System.out.println(num1+" is larger then "+num2);
    }else if (num2>num1){
        System.out.println(num2+" is larger then "+num1);
    }else{
        System.out.println(num1+" are equal to "+num2);
    }
}
    public static void main(String[] args) {
        T1ParametersAsNumbers num=new T1ParametersAsNumbers();
        num.findLargest(5,10);
    }
}
