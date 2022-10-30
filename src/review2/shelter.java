package review2;
//Related to Dog
public class shelter {
    public static void main(String[] args) {
        //acessing static - use class name
        Dog.breed="Huskey";
        Dog dog1=new Dog();

        //how to access instance variable - through object variable
        dog1.name="Bobby";
        dog1.weight=5;
        dog1.printInfo();

        Dog dog2=new Dog();
        System.out.println(dog2.name);  //null
        dog2.name="Tommy";
        dog2.weight=10;
        System.out.println(dog2.name); //Tommy
        dog2.printInfo();


        System.out.println("--Making Changing--");
        //you want to change the name of your dog

        dog1.name="Bobik";
        dog1.breed="german";
        dog1.printInfo();  //Dog1 =Name change and breed changed to be german becuz breed is Static variable
        dog2.printInfo(); //Dog features:Tommy,10,german

        double price=dog1.getPrice();
        System.out.println(price);

        double price2=dog2.getPrice();
        System.out.println(price2);

        System.out.println(dog1.bark());
        System.out.println(dog2.bark());


    }
}
