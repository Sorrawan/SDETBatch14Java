package review2;
//Realated to School class
//จดไม่เสร็จ
public class Teacher {
    String name,lastName;
    int experience;
    String subject;                //This all are Instance variable
    double salary;

    static String school;
    //how to crete a constructor
    /*
    1.constructor name=classname
    2. no return type not even void
     */

    //using below constructor we innitialize instance variables(nam,lastName
    Teacher(String fName,String lName){
        name=fName;     //Instance = Local;
        lastName=lName;  // Instance = Local;
    }

    /*
    When you create a constructor
     */
    void print(){
        System.out.println(name+" "+lastName);
    }
}
