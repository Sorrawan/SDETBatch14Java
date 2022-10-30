package class22;
//final keyword= can't change its value of that field.
//Can't be overridden, but can be inheritance
//Mostly will see "Using final keyword with variable"
public class FinalDemo {
//When ever we don't want anyone to change the

    public static void main(String[] args) {
        Phone phone=new Iphone();
       // phone.RAM=50;  //will get an error

    }
}
class Phone{

    final int RAM=12;
    void takePics(){
       // RAM=15;  // If assign any new value, will get an error bcuz it's already finalized
        final int number=10;


    }
}
class Iphone extends Phone{
    void takePics(){

    }

}