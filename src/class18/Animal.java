package class18;

//Inheritance  to reduce repetition code, this is like parents
//Horse, Dog, Cat classes are related
public class Animal {
    // All fields that 3 classes use same fields
    protected String name;  // protected keyword=> Other class can access if it is under Inheritance of this class, another class that is not under Inheritance cannot access any field within this class
    String breed;
    int age;
    double weight;

    //Example Then add "extends Animal" in  =>  public class Cat extends Animal {
    // Then add "extends Animal" in  => public class Dog extends Animal {
    // Then add "extends Animal" in  => public class Horse extends Animal{

    void printInfo(){   //use in Horse class, WE cannot Inheritance constructor but we can recall it in Animal (parents class)
        System.out.println("name "+name+" Breed "+breed+" age "+age+" Weight "+weight);
    }
}
