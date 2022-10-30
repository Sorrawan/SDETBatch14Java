package class21;
//Overriding
//Related to EmployeeTester class
public class Employee {
    String name;
    double baseSalary=40000;
    double bonus=20000;

    void calculateSalary(){
        System.out.println(baseSalary+bonus);
    }
}
class Developer extends Employee{
    //Overriding
    //Want to use the same exact method but diff body inside child class
    //Developer gets pay differently

    void calculateSalary(){
        System.out.println(2*baseSalary+(1.5*bonus));

        }
   /*     // but if we have "Super" here, Java wil call it from Parent class first
   void test(){
        super.calculateSalary();
        calculateSalary();
    }
    */
}
class Tester extends Employee{
    void calculateSalary(){
        System.out.println(baseSalary+(2*bonus));
    }
}
class OfficeBoy extends Employee{

}
class Test{
    public static void main(String[] args) {
        Developer developer=new Developer();
        developer.calculateSalary();     //Then Java will call from Child class first, if Java can't find from there will find in Parent class
        // developer.test();             //"super.calculateSalary();" but if we have "Super" here, Java wil call it from Parent class first
    }
}