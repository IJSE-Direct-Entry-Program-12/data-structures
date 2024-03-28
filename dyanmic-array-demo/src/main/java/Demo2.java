import java.util.ArrayList;
import java.util.Vector;

public class Demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(10);
        nums1.add(20);
        nums1.add(30);
        nums1.add(40);
        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(50);
        nums2.add(60);
        Vector<Integer> nums3 = new Vector<>();
        nums3.add(70);
        nums3.add(80);

        nums1.addAll(nums2);
        System.out.println(nums1);  // [10,20,30,40,50,60]
        nums1.addAll(1, nums3);
        System.out.println(nums1);  // [10,70,80,20,30,40,50,60]
    }
}
