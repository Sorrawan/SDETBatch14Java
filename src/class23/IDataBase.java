package class23;

//Using Interface  that alreay come with "abstract by default"
// so no need to type "abstract"

//ดูเทียบกับ DataBase class เอาว่าเปนยังไง
//interface   comes with "implements "

public interface IDataBase {

     //So those are  "abstract by default"
     void openDatabase();
    void readData();
    void writeData();
}
class IBM implements IDataBase{


    @Override
    public void openDatabase() {
        System.out.println("Opening the IBM database");
    }

    @Override
    public void readData() {
        System.out.println("Reading the data from the IBM Database");
    }

    @Override
    public void writeData() {
        System.out.println("Writing the data to the database");
    }
}