package class17;
//Related to EmpTester
public class Employee {
   private String name;     //Adding "Private"This thing can only be access within the same class
    private String department;
    private double salary;
    private String id;
    private int age;
    private double actualSalary;   //share someting accross the method use "Instance field"
    String companyName="Syntax";

    //Write Constructor , name of constructor has to be the same as Class name!
    Employee(String empName,String empDepart,double empSalary,int empAge){
        name=empName;
        department=empDepart;
        salary=empSalary;
        age=empAge;
    }



    void printSalary(){
        double actualSalary=salary+20000+10000;
        System.out.println(actualSalary);
    }
    void calculatePrintTax(){
        double tax=actualSalary*.3;
        System.out.println("Tax "+tax);
    }


}
