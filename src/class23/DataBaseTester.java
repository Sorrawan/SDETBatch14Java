package class23;

//Upcasting
public class DataBaseTester {
    public static void main(String[] args) {
        DataBase dataBase=new Oracle();    //Upcasting
        dataBase.openDatabase();
        dataBase.readData();
        dataBase.writeData();
        dataBase.closeDatabase();
    }
}
