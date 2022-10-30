package review3;
//Related to Teacher

public class School {
    public static void main(String[] args) {


        Teacher t = new Teacher("John", "Smith");
        System.out.println(t.name);

        Teacher t1= new Teacher("John","Smith","Biology");
        t1.teach();

        Teacher t2=new Teacher("Jack","Smith",5);

        Teacher.school="Syntax";

        Teacher.work();   //public

        t2.print();      //protected
        t2.teach();      //default

        //t2.getBonus(); method from the type Teacher is not visible



    }
}
