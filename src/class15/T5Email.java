package class15;

public class T5Email {
    /*
  5.Create a method createEmail(). Based on values of users name, lastName and email type,
  your method should return complete email Address.
  Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
   */


    String cEmails(String firstName,String lastName,String emailType){
        return (firstName+lastName+"@"+emailType+".com").toLowerCase();
    }
    public static void main(String[] args) {
        T5Email task5=new T5Email();
        String fullEmail=task5.cEmails("John","Snow","gmail");
        System.out.println(fullEmail);

        System.out.println(task5.cEmails("Sorrawan","Suter","outlook"));
    }
}
