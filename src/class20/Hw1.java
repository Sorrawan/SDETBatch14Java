package class20;

public class Hw1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
Rectangle
Square
Box

Use separate class to test your code
     */

    int s;
    int t;
    int side;
    int length;
    int width;
    int height;

    void retangle(int s, int t) {
        System.out.println("Retangle " + s * t);
    }

    void square(double side) {
        System.out.println("Square " + side * side);
    }

    void box(int length, int width, int height) {
        System.out.println("Box " + length * width * height);
    }

}
class Hw1Tester extends Hw1{
    public static void main(String[] args) {
        Hw1 CaseOfBox=new Hw1();
        CaseOfBox.retangle(4,5);
        CaseOfBox.square(4);
        CaseOfBox.box(3,4,5);
    }
}


