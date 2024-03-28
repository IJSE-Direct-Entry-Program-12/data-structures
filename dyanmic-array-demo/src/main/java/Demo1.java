import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        System.out.println(nums);
        nums.add(1, 15);
        System.out.println(nums);
    }
}
