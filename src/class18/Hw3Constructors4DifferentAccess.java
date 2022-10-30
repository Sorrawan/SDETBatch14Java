package class18;

public class Hw3Constructors4DifferentAccess {

    /*Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this
    class: 1 - inside same class; 2 - from outside the class; 3 - from different class inside different package
    and observe result.
     */

    private Hw3Constructors4DifferentAccess(){
        System.out.println("Private");
    }
    Hw3Constructors4DifferentAccess(String name){
        System.out.println("Default");
    }
    protected Hw3Constructors4DifferentAccess(int age){
        System.out.println("Protected");
    }
    public Hw3Constructors4DifferentAccess(boolean isTrue){
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new Hw3Constructors4DifferentAccess();
        new Hw3Constructors4DifferentAccess("Thank you");
        new Hw3Constructors4DifferentAccess(10);
        new Hw3Constructors4DifferentAccess(true);
    }
}

