package class17;
//Related to DogTester
//จดไม่เสร็จ
public class Dog {
    private String name;       //Adding "Private"This thing can only be access within the same class
    private String breed;
    private String color;
    private int age;
    private double weight;

    //Constructor
    Dog(String dogName,String dogBreed,String dogColor,int dogAge,double dogWeight){
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if(dogAge>30){
            System.out.println("Please enter a valid value");
        }else{
            age=dogAge;
        }
        weight=dogWeight;
    }

    void printInfo(){

        System.out.println("name"+name+" breed "+breed+" age "+age);
    }

    public static void main(String[] args) {
        /*
        Dog dog=new Dog();
        dog.name="Tomy";
        dog.breed="Huskey";
        dog.color="Pink";
        dog.age=10;
        dog.weight=30;
        dog.printInfo();
        */

        //Constructor
        Dog dog=new Dog("Tomy","Huskey","Pink",10,30);
        dog.printInfo();

       /*
       Dog dog2=new Dog();
        dog2.name="Tomy";
        dog2.breed="Huskey";
        dog2.color="Pink";
        dog2.age=10;
        dog2.weight=30;
        dog2.printInfo();
        */

        //Constructor
        Dog dog2=new Dog("Cmi","German","Black",20,30);
    }
}
