package class18;
//Related to Hw3Constructors4DifferentAccess
public class Hw3Tester {
    public static void main(String[] args) {
       // new Hw3()Constructors4DifferentAccess;   //because it's private. can't call it outside the classHw3
        new Hw3Constructors4DifferentAccess("Thank you");  //
        new Hw3Constructors4DifferentAccess(10);
        new Hw3Constructors4DifferentAccess(true);
    }
}
