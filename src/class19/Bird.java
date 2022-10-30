package class19;
//How to use "SUPER"
public class Bird {
    String name;
    String color;
    int age;
    double weight;

    Bird(String name,String color,int age, double weight) {  //Constructor in PARENT class
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
    }
    void printInfo(){
        System.out.println("Name "+name+" Color"+color+" Age "+age+" Weight "+weight);
    }
}
class Parrot extends Bird{
    Parrot(String name,String color,int age, double weight) {  //Constructor
        super(name,color,age,weight);   //Super only work when we have parent, child relationship to use constructor from parent class
       /* this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
        */
    }
}
class Crow extends Bird{

    Crow(String name,String color,int age, double weight) {  //Constructor
        super(name,color,age,weight);    //Recall constructor from PARENT class
       /* this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;
        */
    }
}
class Sparrow extends Bird{
    Sparrow(String name,String color,int age, double weight){   //Constructor
        super(name,color,age,weight);    //Recall constructor from PARENT class
    }
}
class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Zeki","Green",2,1);
        parrot.printInfo();

        Crow crow=new Crow("Tik","Blue",2,4);
        crow.printInfo();

        Sparrow sparrow=new Sparrow("Minmin","white",5,3);
        sparrow.printInfo();

    }


}
