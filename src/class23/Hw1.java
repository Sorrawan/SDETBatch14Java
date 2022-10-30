package class23;

 public class Hw1 {
    /*
    Create a class File that will have
    the following behaviors: open, edit, close. Edit and close are implemented method while open is an abstract.
    Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific implementation of open behaviour:
    Example: to open .java file we need notepad++ or sublime text, to open .doc file
    we need Microsoft word to be installed etc
     */

}
 abstract class  File {
   abstract void open();
    void edit(){
        System.out.println();
    }
    void close(){
        System.out.println();
    }

}
class JavaFile extends File{
     @Override
    void open(){
         System.out.println("To open .java file we need notepad++ or sublime text");
     }
}
class WordFile extends File{
    @Override
    void open(){
        System.out.println("To open WordFile we need to select the file you want to open  ");
    }
}
class PdfFile extends File{
    @Override
    void open(){
        System.out.println("To open PdfFile we need to open the Adobe Acrobat");
    }
}