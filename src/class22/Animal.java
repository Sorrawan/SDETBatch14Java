package class22;
//Overriding review
//Related to AnimalTester,class22
public class Animal {
    void eat(){
        System.out.println("Animal usually eat plants");
    }
    void sleep(){
        System.out.println("Animal sleep for 8 to 10 hours");
    }
}
class Panda extends Animal{
    @Override
    void eat(){
        System.out.println("Pandas eat Bamboo");
    }
    /*
    //@override = is an annotation that tells javva to check for extra rules like if we are properly overriding a method or not
     */
    @Override
    void sleep(){
        System.out.println("Panda sleep for 14 hours");
    }
}
class Cat extends Animal{
    @Override
    void eat(){
        System.out.println("Cats like to eat Fish");
    }
}

