package review4;
//จดไม่เสร็จ
public class Fruit {
    protected String name;
    String shape;
    private String color;

    public static boolean fresh;

    public Fruit(String name){     //Constructor
        this.name=name;
    }

    Fruit(String name, String shape, String color){        //Constructor
        this(name);
        this.shape=shape;
        this.color=color;
    }

     void grow() {
        System.out.println("All fruits grow fresh "+fresh);
    }

    public  static void havePeel(){
        System.out.println("All fruits are very easy to peel");
    }

    protected void haveBenefits() {
        System.out.println("All fruits good for your health");
    }

}
