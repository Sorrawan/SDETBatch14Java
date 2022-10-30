package class19;
//Related to Animal class, class19
//Super Keyword
public class Dog extends Animal{

    public Dog(String name,String breed,String color){
     super(name,breed,color);
    }

}
class Cat extends Animal{
    public Cat(String name,String breed,String color){
        super(name,breed,color);
    }
}
class TestAnimal{
    public static void main(String[] args) {
        Dog dog=new Dog("Jacky","German","Black");
        dog.printInfo();
    }
}