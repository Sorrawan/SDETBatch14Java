package review4;
//จดไม่เสร็จ
public class Apple extends Fruit {
    String size;
    String taste;
    double price;

    Apple(String name, String shape, String color, String size){
        super(name, shape, color);
        this.size=size;
    }

    Apple(String name, String shape, String color, String size,String taste, double price){
        this(name, shape, color, size);
        this.taste=taste;
        this.price=price;
    }

    //In overloading = method signature MUST BE DIFFERENT
    //Method signature = name+parameters

    //Child class can have their own methods as well
    void makeJuice(){
        System.out.println("from "+name+" we can make "+taste+" juice");
    }

    //Do overloading to be able to have the same method name and within the same class
    void makeJuice(String fruit){
        System.out.println("We can have juice from "+name+" mixed with "+fruit);
    }

    public static void main(String[] args) {

        Apple app=new Apple("apple", "circle", "red", "big");
        // app.color; not visible since it acc mod is PRIVATE

        System.out.println(app.name);
        System.out.println(app.shape);
        System.out.println(Fruit.fresh);  //Call by "Class.parameter"
        System.out.println(Apple.fresh);

        app.grow();             //Come from "Parent class"
        app.haveBenefits();     //Come from "Parent class"
        app.makeJuice();        //Come from "Child class"
    }


}
