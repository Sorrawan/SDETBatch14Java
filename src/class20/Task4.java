package class20;

public class Task4 {
    /*
    Write program: userClass  that has a constructor that initializes instance variable name and mobile number.
Create a subclass  userInfo that will have user address variable and it also being initialized through constructor call.
Print users name, mobile number and address in userDetails method. Test your code.
     */
    public static void main(String[] args) {
        UserInfo userInfo=new UserInfo("ZamanUllah","+5715322934","PizzaHut King Street");
        userInfo.printUserDetails();
    }
}

class UserClass{
    String name;
    String mobileNumber;

    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends UserClass{
String address;
UserInfo(String name,String mobileNumber,String address){
    // this.address=address;    //We cannot write any code before Super (Parent class), we will get an error
    super(name,mobileNumber);  //becuz we need to bring constructor from Parent class to live
    this.address=address;
}

void printUserDetails(){
    System.out.println("Name "+name+" Mobile Number"+mobileNumber+" Address "+address);
}
}





