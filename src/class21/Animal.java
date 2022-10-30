package class21;
//Related to AnimalTester class
public class Animal {
    void sleep(){
        System.out.println(" Animal usually sleep for 6 hours");
    }
    void eat(){
        System.out.println("Glass and meat");
    }
}
class Cat extends Animal{
    void sleep(){
        System.out.println("I like to sleep for 20 hours");
    }
    void eat(){
        System.out.println("I only like fish");
    }
}
class Dog extends Animal{
    void sleep(){
        System.out.println("I like to sleep for 10 hours");
    }
    void eat(){
        System.out.println("Dogs like meat");
    }
}