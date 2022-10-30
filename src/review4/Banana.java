package review4;
//จดไม่เสร็จ

public class Banana extends Fruit{

    String origin;

    //1.Create your own constructor
    //2. Make a call to Parent constructor by "Super"
    Banana(String name,String shape,String color,String origin ){
        super(name,shape,color);
        this.origin=origin;
    }

    /* when child class have same method name as super class -
     * overriding - 2 methods with same name BUT inside Different classes
     */

    /* how to override
     *
     * 1. method signature MUST be same
     * 2. return type MUST BE SAME
     * 3. access modifier/visibility MUST be same or MUST be higher
     *
     */
    protected  void grow(){
        System.out.println(name+" grow fast and fresh");
    }

    // when child class have same static method as parent class
    // we are not achieving overriding.
    // this calls method hiding

    public  static void havePeel(){   //We cann't do overriding with Static methods so we call "a Method hiding"
        System.out.println("Banana is very easy to peel");
    }
    void makeSmoothie(){
        System.out.println("From "+name+" we get tasty smoothie");
    }

    public static void main(String[] args) {
        Banana ban=new Banana("banana","banana shape","yellow","Ecuador");
        ban.grow();             //Come from PArent class
        ban.haveBenefits();     //Come from PArent class
        ban.makeSmoothie();     //Come from Child class

        //runtime Polymorphism
        Fruit fruit=new Banana("banana","banana shape","green","Africa");
        // "Fruit fruit"=new Banana"then JAva will look for grow(); in Banana 1st then if couldn't find, will go to find in Fruit
        fruit.grow();   //runtime Polymorphism
        fruit.haveBenefits();       //runtime Polymorphism

        fruit.havePeel();    //Call from Parent class  (Fruit)
        fruit.havePeel();   //Call from Banana



    }
}
