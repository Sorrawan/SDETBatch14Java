package class22;
//Related to Car, class22
public class carTester {
    public static void main(String[] args) {
        BMW bmw=new BMW();
        bmw.start();   //Use Push start to start me //call from BMW (Child class)
        bmw.stop();  //If we use"Super", it will call from Parent class

        Toyota toyota=new Toyota();
        toyota.start();  //Put me to start   //call from Toyota (Child class)
        toyota.stop();   //Call from Parent class

        Tesla tesla=new Tesla();
        tesla.stop(); //Call from child class
    }
}
