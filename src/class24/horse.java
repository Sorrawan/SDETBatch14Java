package class24;
//Create Setter and Getter
//จดไม่เสร็จ
public class horse {
    private String name;
    private String breed;
    private String color;
    private int age;


    public horse(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>20){
            System.out.println("Please enter the name less than 20 letters ");
        } else if (name.isEmpty()) {
            System.out.println("Please enter the name of the horse");
        }else {
            this.name = name;
        }
    }

    public String getBreed(String name) {   // Can assign "Name" and create the condition
        if(name.equals("Josh")){
           return "Not allowed";
        }
        return breed;
    }

    public void setBreed(String breed) {
        if(breed.isEmpty()){
            System.out.println("Breed can't be empty");
        }else{
            this.breed = breed;
        }

    }

    public String getColor() {
       return color;


    }

    public void setColor(String color) {
        if(color.isEmpty()){
            System.out.println("color can't be empty");
        }else{
            this.color= color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0){
            System.out.println("Age can't be negative");
        }else {
            this.age = age;
        }
    }
}
