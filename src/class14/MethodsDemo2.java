package class14;

public class MethodsDemo2 {
    void printMAnyTimes(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("Hello Java");
        }
    }

/*
In parameters sequence and data type matters
 */
    void printCustomWormanyTimes(String word,int times){
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        MethodsDemo2 md=new MethodsDemo2();
        md.printMAnyTimes(5);

        System.out.println("**********************");

        md.printCustomWormanyTimes("Syntax Easy",3);
    }
}
