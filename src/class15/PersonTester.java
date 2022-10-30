package class15;

import class16.Person;

//Related with Person, class16
public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //double salary=1000; => if we didn't define ex. private/proteced (Class16), JAva will be set it as default so "salary" can be accessed only within the same package.
        //Then PersonTester.class15 cannot access that value
        //System.out.println(person.salary);
    }
}
