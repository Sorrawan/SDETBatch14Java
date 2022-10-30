package class20;
//Create 3 subclasses
//Related to TeacherTester
public class Task3 {
    /*
    Write a Java program called Teacher.  Identify features and behaviour of that Class.
    Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher
    that would have it their own features and behaviour. Test all 4 classes
     */
}

class Teacher{
   protected String name;      //use"protected" อาจารอยากใช้เฉยๆ ใช้อย่างอื่นก็ได้
    protected int age;
    protected int yearOfExperience;
    Teacher(String name,int age,int yearOfExperience){
        this.name=name;   //this mane plase use this "private String name;" instead of "String name"
        this.age=age;
        this.yearOfExperience=yearOfExperience;
    }
    void teach(){
        System.out.println(name+" is teaching");
    }
}
class MathTeacher extends Teacher{
    void teachTheClass() {
        System.out.println("I will teach the class even the world is going to end");
    }

    MathTeacher(String name,int noOfYears,int age){
        //"int noOfYears" wean change the name and Java still use "int yearOfExperience"
        //We can to use the constructor from Pareant class but we need to use at least 3 fields from Parent class
        //to be able to bypass this rule.
        super(name,age,noOfYears);
    }
}
class ChemistryTeacher extends Teacher{
boolean teachOrganic;
    ChemistryTeacher(String name, int age, int yearOfExperience) {
        super(name, age, yearOfExperience);
    }
    void teachChem(){
        System.out.println(name+" teaching Chemistry");
    }
}
class PianoTeacher extends Teacher{
String pianoType;
    PianoTeacher(String name, int age, int yearOfExperience,String pianoType) {
        super(name, age, yearOfExperience);
        this.pianoType=pianoType;
    }

}