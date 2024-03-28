import java.util.ArrayList;
import java.util.List;

public class Demo8 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);   // 0
        nums.add(20);   // 1
        nums.add(30);   // 2
        nums.add(40);   // 3
        nums.add(50);   // 4
        List<Integer> subList = nums.subList(1, 3);
        System.out.println(subList);    // [20,30]

        //nums.forEach(value -> System.out.println(value));
        nums.forEach(System.out::println);
    }
}
