package class22;
//Review Overriding
//Related to carTester, class22
//จดไม่เสร็จ
public class Car {
    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("Use breaks to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car {
    //Overriding
    @Override
    void start(){
        System.out.println("Use Push start to start me");
    }

    void stop(){
        super.stop();   //Use"Super"  then Java will call from Parent class
        System.out.println("You can use auto breaking to stop me");
    }
}
class Toyota extends Car{
    @Override
void start(){
    System.out.println("Put me to start");
}
}
class Tesla extends Car{

    void start(){
        System.out.println("Use the app to start me");
    }
    void stop(){
        System.out.println("Use AI and Autobreaking to stop me");
    }
    void park(){
        System.out.println("I can auto park myself");
    }
}
