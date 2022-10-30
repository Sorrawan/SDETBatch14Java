package class21;
//Override
//allow us to provide if we dont like something from Parent class, we can change/override it under same method name

public class Parent {
    void getMarry(){
        System.out.println("You will marry the girl that we will select for you");
    }
}
class Zam extends Parent{

    void gerMarry(){
        System.out.println("I want to marry Taylot Swift");
    }
}
class ParentTester{
    public static void main(String[] args) {
        Zam zam=new Zam();
        zam.gerMarry();
    }
}