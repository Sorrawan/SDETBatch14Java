package class18;
//Keyword
//Inheritance => Related to Animal class
public class Dog extends Animal {

    String color;
    double height;

    //Create constructor

    public Dog(String name, String breed, String color, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String name, String breed, String color, int age, double weight, double height) {
        /* this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.weight = weight; */
        this(name, breed, color, age, weight);   //Not normally use,this line will call the constructor auto, save time, no repeating writing the same code
        this.height = height;
    }


}
