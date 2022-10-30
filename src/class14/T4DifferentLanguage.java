package class14;

public class T4DifferentLanguage {
    /*
    4.Create a method that will say Hello in different language based on the country
    that will be passed when method is executed
     */
    void say(String country) {
        if (country.equals("usa")) {
            System.out.println("Hello");
        } else if (country.equals("Thailand")) {
            System.out.println("Sawasdee");
        } else if (country.equals("Korea")) {
            System.out.println("Unyounghaseyo");
        }
    }

    public static void main(String[] args) {
        T4DifferentLanguage c = new T4DifferentLanguage();
        c.say("Thailand");
    }
}
