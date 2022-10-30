package class16;
//จดไม่เสร็จ
public class Student {
    /*
    Create a Class called Students
    Create three variables NAme,ID and numberOfStudents
    Create three
     */
    String name;
    String id;
    static int numberOfStudent;

    public static void main(String[] args) {
        Student roman= new Student();
        roman.id="1";
        roman.name="Ivan";
        roman.numberOfStudent++;

        Student sonamKapor= new Student();   //sonamKapor=> Object name
        sonamKapor.id="2";
        sonamKapor.name="Sonam";    //  Sonam=> Acual student name
        sonamKapor.numberOfStudent++;

        System.out.println(sonamKapor.numberOfStudent);
        System.out.println(roman.numberOfStudent);
        System.out.println(Student.numberOfStudent);
    }
}
