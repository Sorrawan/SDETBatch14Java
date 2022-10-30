package class20;

public class Hw2 {
    /*
    Create a class named 'Programming'. While creating an object of the class, if nothing is passed to it,
    then the message "I love programming languages" should be printed. If some String is passed to it,
    then in place of "programming languages" the value variable should be printed. Example, if we pass "Java",
    then "I love Java" should be printed.
     */
}

class Programming {

    void printInfo(String a){
        System.out.println("I love Java");
    }
    void printInfo(){
        System.out.println("I love programming languages");
    }

    public static void main(String[] args) {
        Programming type=new Programming();
        type.printInfo();
    }
}


