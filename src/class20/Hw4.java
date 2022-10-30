package class20;

public class Hw4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */

    private void profile(String name, int height){
        System.out.println("Name "+name+" Height "+height+" cm.");
    }
    private void profile(String name, double height){
        System.out.println("Name "+name+" Height "+height+" cm.");
    }
    private void profile( double height, String name){
        System.out.println(" Height "+height+" cm."+"Name "+name);
    }

    public static void main(String[] args) {
        Hw3 person=new Hw3();
        person.profile("Sorrawan",165);
        person.profile("Sorrawan",165.3);
        person.profile(165.3,"Sorrawan");
    }
}
