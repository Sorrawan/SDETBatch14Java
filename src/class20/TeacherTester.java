package class20;
//Realted to Teacher class in Task3
public class TeacherTester {
    public static void main(String[] args) {
        //Java allow you to use this parameter in Parent class unless you follow the rule by enter 3 fields
        MathTeacher mathTeacherteacher=new MathTeacher("Gulcan",18,5);
        mathTeacherteacher.teach();

        PianoTeacher pt=new PianoTeacher("James",25,6,"Grand");
        pt.teach();
    }
}
