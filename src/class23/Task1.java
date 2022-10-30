package class23;
//Hw : Polymorphism
//RElated to StudentTester

public class Task1 {
    /*
    Create a Class Student that will have 3 subclasses as SyntaxStudent, CollegeStudent, SchoolStudent.
Define common behavior within parent class and override some of the methods in child classes
Define some methods specific to child classes
Write example of achieving run time polymorphism
     */
}
class Student{
    void study(){
        System.out.println("Student must study");
    }
    void doHomeWork(){
        System.out.println("Student must solve their homeworks");
    }
    void doPractice(){
        System.out.println("Student must practice to get good mark");
    }
}
class SyntaxStudent extends Student{
    @Override
    void doHomeWork(){
        System.out.println("Syntax students must solve all Repls three time");
    }
    @Override
    void doPractice(){
        System.out.println("Syntax student must do their own research and practice");
    }
}
class CollegeStudent extends Student{
    @Override
    void doPractice() {
        System.out.println("College students must practice to get good marks");
    }
}
class SchoolStudent extends Student{

}

