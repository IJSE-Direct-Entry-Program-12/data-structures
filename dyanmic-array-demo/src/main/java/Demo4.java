import java.util.ArrayList;

public class Demo4 {

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        Integer oldValue = nums.set(1, 15);
        System.out.println(oldValue);           // 20
        System.out.println(nums);               // [10,15,30]
    }
}
