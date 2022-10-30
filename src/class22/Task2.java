package class22;
//Override
//Related to CreditCardTester, class22
//จดไม่เสร็จ
public class Task2 {
    /*
    Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
Call the method by creating an object of each of the three classes.
     */
}
class CreditCard{
    double balance;
    double interest;
    CreditCard(double balance,double interest){
        this.balance=balance;
        this.interest=interest;
    }
    void calculateInterest(){
        double InterestAmount=interest*balance/100;
        System.out.println("Interest Amount  "+InterestAmount);
    }
}
class Visa extends CreditCard{
    Visa(double balance,double interest){
        super(balance,interest);    //We need to call use "super" to call constructor from Parent class
    }
    @Override
    void calculateInterest(){
        double InterestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest Amount  "+(InterestAmount+5));;
    }
}
class AX extends CreditCard{
    AX(double balance,double interest){
        super(balance,interest);    //We need to call use "super" to call constructor from Parent class
    }
    @Override
    void calculateInterest(){
        double InterestAmount=interest*balance/100;
        System.out.println();
        System.out.println("Interest Amount  "+(InterestAmount+10));
    }
}
