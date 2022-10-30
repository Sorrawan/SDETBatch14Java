package class20;

public class MethodOverloading2 {
     void F1(String name,int number){
        System.out.println("String name,int number");
    }
    void F1(String name,int number,int number2){   //1. by changing the no. of parameters
        System.out.println("String name,int number,int number2");
    }
    void F1(int num1,int number){              //2. by changing data type
        System.out.println("int num1,int number");
    }
    void F1(int number,String name){           // 3. by changing the sequence of parameters
        System.out.println("int number,String name");
    }

    public static void main(String[] args) {
        MethodOverloading2 md=new MethodOverloading2();
        md.F1("Taras",20);
    }
}
