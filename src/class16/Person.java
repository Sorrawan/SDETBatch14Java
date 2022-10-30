package class16;

// we can have multiple classes in one file but can have only
//one public class and has the name same as file name

public class Person {
//Related with PersonTester, class16

private String password="pass123";
double salary=1000;   //if we didn't define ex. private/proteced, JAva will be set it as default so "salary" can be accessed only within the same package.

    public static void main(String[] args) {
        Person person1=new Person();
        System.out.println(person1.password);
        System.out.println(person1.salary);


    }
}
class Bank{

}
