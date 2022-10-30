package class15;

public class T4Language {
    /*
    4.Create a method that will say Hello in different language based on the country
    that will be passed when method is executed
     */

    void sayHello(String country){
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Pakistan":
                System.out.println("AOA");
                break;
            case "Konichiwa":
                break;
        }
    }
    public static void main(String[] args) {
        T4Language task4=new T4Language();
        task4.sayHello("USA");
        task4.sayHello("Pakistan");
    }
}
