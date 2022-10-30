package class18;

public class ThisKeywordDemo {
    String str="Red";
    void print(){
        String str="Blue";
        System.out.println(str);   //Blue   => it will access the local variable
        System.out.println(this.str);   //Red   =>"this." it will access the instant variable
    }

    public static void main(String[] args) {

        new ThisKeywordDemo().print();   //Blue  Red
    }
}
