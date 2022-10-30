package review3;

//Related to country
    public class Peru extends country{
        double salary;
        Peru(String name){
            super(name);    //Use "Super" = to call a Parent class constructor
        }
        /*

         */
        public static void main(String[] args) {
            Peru peru=new Peru("Peru");   //super(name);
            peru.name="Peru";
            peru.capital="Lima";
            peru.population=22000000;
            peru.salary=1000;

            //peru.president- private


        }
}