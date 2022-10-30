package class23;
//Related to Task1 ,class23
//Hw : Polymorphism
public class StudentTester {
    public static void main(String[] args) {
        Student[] arr={new SyntaxStudent(),new SchoolStudent(),new SyntaxStudent()};

        for(Student st:arr){
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
