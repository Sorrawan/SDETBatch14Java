package class17;

//จดไม่เสร็จ
public class Person {
    String name;
    String color;
    String country;
    int age;
    double weight;
    String haircolor;
    String eyecolor;
    double height;
    static char gender = 'M';

    //Shortcut to create Constructor => Right click+Generate+Constructor+select field you want to add

    //To give them flexibility by adding more rule otherwise they can't use constructor when they missed entering
    //all fields that you create.
    public Person() {    // Having this so user can passing without enter any value and they still can use constructor

    }

    public Person(String perName) {   //user can using Constructor by user can put only one value
        name = perName;
    }

    public Person(String name, String color, String country, int age, double weight, String haircolor, String eyecolor, double height, char gender) {
        this.name = name;
        this.color = color;
        this.country = country;
        this.age = age;
        this.weight = weight;
        this.haircolor = haircolor;
        this.eyecolor = eyecolor;
        this.height = height;
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person person = new Person();     // public Person(){}
        Person person2 = new Person("Asma");   // public  Person(String perName){}
    }
}

