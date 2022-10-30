package class14;

public class T5CreateEmail {
    /*
    5.Create a method createEmail(). Based on values of users name, lastName and email type,
    your method should return complete email Address.
    Example:  createEmail(John, Snow, gmail) → johnsnow@gmail.com
     */
    String usersName;
    String lastName;
    String emailType;

    void createEmail() {
        System.out.println(usersName+lastName+"@"+emailType+".com");
    }

    public static void main(String[] args) {
T5CreateEmail account=new T5CreateEmail();
account.usersName="sorrawan";
account.lastName="suter";
account.emailType="gmail";
account.createEmail();
    }
}
