package class21;
//Related to Employee class
//Overriding
public class EmployeeTester {
    public static void main(String[] args) {
        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculateSalary();  //we will get method from Parent class becuz No override in officeBoy class(Child class)

        Tester tester=new Tester();
        tester.calculateSalary();  // We will get the method from Tester class(Child class) due to OVERRIDE
    }
}
