package class20;
//multilevel inheritance

//แวะมาเช็ค
public class Task1 {
    public static void main(String[] args) {
        //C c=new C();    // A B C    // Becuz Java will go to Parent class then go to Child Class
        B b=new B();       // A B    // Becuz Java will go to Parent class then go to Child Class
    }
}
    /*
    Write program for multilevel inheritance where class C inherits
    from class B and Class B inherits from Class A.
     */

    class A{
A(){
    System.out.println("A");
}
    }
    class B extends A{
        B(){
            System.out.println("B");
        }
    }
    class C extends B{
        C(){
            System.out.println("C");
        }
    }

