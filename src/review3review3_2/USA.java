package review3review3_2;
//Related to country, review3 class
import review3.country;

public class USA extends country {
    public USA(String name) {
        super(name);
    }

    public static void main(String[] args) {
        USA usa = new USA("USA");
        usa.name = "USA";   //public
        usa.capital = "DC"; //protected

    }
}