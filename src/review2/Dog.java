package review2;
//Related to Shelter
//จดไม่เสร็จ
public class Dog {
    //Dog features:Tommy,10,german
    String name;   //instance variable
    int weight;   //instance variable
    static String breed;  //static

    //when we do not create a constructor->

    void printInfo(){
        System.out.println("Dog features:"+name+","+weight+","+breed);
    }
    void love(String thing){
        System.out.println(name+" loves "+thing);
    }

    //Create a method to calculate price
    //if weight is more than 5-> 100
    //if weight is more than 10 -> 300
    //if weight is more than 20 -> 1000
    double getPrice(){
        if(weight<5){
            return 100;
        }else if (weight<10){
            return 300;
        }else{
            return 1000;
        }
    }

    //Create a method that will return bark type
    /*
    if weight <5  -> lound
    if weight <20 ->  wooh
    if <500 > gav
     */
String bark(){
    String noise;
    if (weight<5){
        noise="loud";
    }else if(weight<10){
        noise="woof woof";
    }else{
        noise="Gav Gav";
    }
    return noise;
}


    /*
    Variables syntax
       how to create
       ex. datatype  name
           String    breed;

     Method syntax

        returnType  name
        Void        printInfo
     */
}
