package class20;

public class Task5 {
    /*
    Write program: Shape class has a constructor that takes the radius and has a subclass as  circle class.
In circle class create a method to calculate the area of circle. Test your code
     */
    public static void main(String[] args) {
        Circle circle=new Circle(6);
        circle.calculateArea();
    }
}
class Shape{
    double radius;         //should have instance all the time
    Shape(double radius){    //Constructor
        this.radius=radius;
    }
}
class Circle extends Shape{
    Circle(double radius){      //should call the Parent constructor
        super(radius);
    }
    void calculateArea(){

        System.out.println(Math.PI*Math.pow(radius,2));
    }
}