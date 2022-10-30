package class22;
//Related to Animal, class22
//+ Up,Down casting
public class AnimalTester {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.sleep();
        cat.eat();

        Animal animal=new Panda(); //Upcasting
        //Panda panda=new Animal(); //down-casting

        Animal animal1=new Cat();
        Animal[] animals={new Cat(),new Panda()};  //Storing the obj. of Child class

    }
}
