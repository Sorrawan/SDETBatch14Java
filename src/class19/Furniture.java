package class19;

public class Furniture {
    String color="Green";

}
class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(color);   //Black    //Print local variable
        System.out.println(this.color);  //Red   //Print instance variable from same class
        System.out.println(super.color); //Green  //Print instance variable of PARENT class
    }
}
class TestChair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
