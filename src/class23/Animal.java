package class23;
//abstract : ไหนๆ Child Class ก็มี their own implementation in their Methods and ไม่ได้ใช้ implementation from Parent class
//so we use "abstract in Parent class" then Chils class can use it and enter their own "implementation" in their own methods
//We never do this part, another team will layout this in real life to show the requirement and we find an error if
//they missed the requirement.


public abstract class Animal {

abstract void eat();      //Method in Parent class
abstract void sleep();    //Method in Parent class
    void walk(){
        System.out.println("Cat walk");
    }

    public static void main(String[] args) {
        //Animal animal=new Animal() ;
        //  aniaml.eat();


    }
}
class Cat extends Animal {
    @Override
    void eat() {       //Method from Parent class
        System.out.println("Animal usually eat Fish");   //Their own Implementation
    }
@Override
    void sleep() {
        System.out.println("Animals usually sleep for 12-16 hours");
    }
    void showAttitude(){
        System.out.println("hmm hmm hmm hmm");
    }
}
class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Animal usually eat Bone");
    }
    @Override
    void sleep() {
        System.out.println("Animals usually sleep for 10 hours");
    }
}