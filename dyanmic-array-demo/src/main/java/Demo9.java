import java.util.Arrays;
import java.util.List;

public class Demo9 {
    public static void main(String[] args) {
        String[] names = {"Kasun", "Nuwan", "Supun", "Ruwan"};
        List<String> nameList1 = Arrays.asList(names);
        List<String> nameList2 = List.of(names);
        List<String> nameList3 = Arrays.asList("Kasun", "Nuwan", "Supun", "Ruwan");
        List<String> nameList4 = List.of("Kasun", "Nuwan", "Supun", "Ruwan");
        System.out.println(nameList1);  // ✅
        System.out.println(nameList2);  // ✅
        System.out.println(nameList3);  // ✅
        System.out.println(nameList4);  // ✅

        System.out.println("======================");

        int[] nums = {10,20,30,40,50};
        List<int[]> numList1 = Arrays.asList(nums);
        List<int[]> numList2 = List.of(nums);
        List<Integer> numList3 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> numList4 = List.of(10, 20, 30, 40, 50);
        System.out.println(numList1);   // ❌
        System.out.println(numList2);   // ❌
        System.out.println(numList3);   // ✅
        System.out.println(numList4);   // ✅

        //ArrayList<int> arrayList = new ArrayList<int>();
    }
}
