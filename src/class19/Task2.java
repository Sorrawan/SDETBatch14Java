package class19;

public class Task2 {
    /*
 Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */
    public static void main(String[] args) {
        Book headFirstJava=new Book("HeadIFirstJava","Kathy",12,13345);
        Book dataStructors=new Book("HeahIFirstJava","Kathy",12);
    }
}
class Book {
    String name;
    String author;
    int noOfTotalCh;
    int ISBN;

    public Book(String name, String author, int noOfTotalCh, int ISBN) {  //Constructor
        /*
        this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;
         */
        this(name, author, noOfTotalCh);
        this.ISBN = ISBN;
    }

    public Book(String name, String author, int noOfTotalCh) {   //Constructor
        this.name = name;
        this.author = author;
        this.noOfTotalCh = noOfTotalCh;

    }
}
