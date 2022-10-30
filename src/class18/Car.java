package class18;
//We can have multiple classes in one file
//should be only one public class and the name should be the same as a file name

public class Car{    //Create Parent class/ Base Class/ Super Class
    String model;
    String make;
    int year;
    String color;
    int topSpeed;
    double price;

    //if a field or method has private access modifier in parent class, child classes cannot use it.
    private String engineType;

    void printCarDetails(){
        System.out.println("Model "+model+" Make "+make+" Color "+color);
    }
}
//Child classes / Derived class
class BMW extends Car{       //Child classes / Derived class
    double engineCC;

}

class Tesla extends Car{     //Child classes / Derived class

}

class Toyota extends Car{    //Child classes / Derived class
    double engineCC;
}

class CarTester{            //Child classes / Derived class
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.make="BMW";
        bmw.color="Black";
        bmw.model="x8";
        bmw.engineCC=500;
        bmw.printCarDetails();
    }


}