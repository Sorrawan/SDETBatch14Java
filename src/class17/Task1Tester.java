package class17;
 //Related to Task1, class17
public class Task1Tester {
    public static void main(String[] args) {

        Task1ArrayAsParameters task = new Task1ArrayAsParameters();
        int[] array = {10, 10, 20, 30};  // OR task.sumArray(new int[] {10,10,20,30});
        System.out.println(task.sumArray(array));


    }
}
