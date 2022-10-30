package review3;
//Related to School
//Using "this."
public class Teacher {
    String name,lname;
    String subject;
    int experience;
    double salary;

    static String school;

    public Teacher(String name, String lname){
        this.name=name;   //Anytime new obj. is created,using" this."keyword to refer the current obj.: instance variables,instance methods
        this.lname=lname;
    }

    // this() - refers to the current obj. : current class constructor
    protected Teacher(String name, String lname,String subject){
        //this() => Constructor call must be the first statement in a constructor
        this(name,lname);  // using" this."keyword to refer the current obj.
        this.subject=subject;    //new obj. that haven't initialized yet
    }
    Teacher(String name, String lname, int experience){
        this(name,lname);
        this.experience=experience;
    }
    //static can work only with static
    public static void work(){
        System.out.println("All teacher work at "+school);
    }
    //Instance member of the class can work with instance and static members
     protected void print(){
        System.out.println("Teacher name is "+name+" "+lname);
    }
    void teach(){
        System.out.println(name+" teacher "+subject);
    }

    //Method that will calculate bonus based on experience and return in
    double getBonus(){      //when we need to return any value
        if (experience<5){
            return 3;
        }else {
            return 3.5;
        }
    }
}
