package class15;

public class LocalVarDemo {

    String name; //instance variable
    static int noOfLegs = 4;   //Statics variable
    String color;

    void bark() {
        int i = 10;  //Local variable
        for (int j = 0; j < i; j++) {
            // Int j is also called Local variable
            System.out.println("Barking.....");
        }
    }

    void printInfo() {
        System.out.println("name " + name + " color " + color);
    }

    void printName() {
        System.out.println("name " + name);
    }

    public static void main(String[] args) {
        int number = 0;

        /*
        Local variables are defined inside blocks of code and can only be used inside those blocks
         */

        LocalVarDemo dog1 = new LocalVarDemo();
        dog1.name="Tomy";
        dog1.bark();

        LocalVarDemo dog2=new LocalVarDemo();
        dog2.name="Lucky";
    }
}

