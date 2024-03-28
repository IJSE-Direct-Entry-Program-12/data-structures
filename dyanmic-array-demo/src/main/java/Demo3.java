import java.util.ArrayList;
import java.util.Vector;

public class Demo3 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kasun");
        names.add("Nuwan");
        names.add("Supun");
        names.add("Ruwan");
        names.add("Kasun");
        names.add("Nimal");

        System.out.println(names.get(2));   // Supun
        System.out.println(names.getFirst());   // Kasun
        System.out.println(names.getLast());   // Nimal
        System.out.println(names.indexOf("Ruwan")); // 3
        System.out.println(names.indexOf("Kasun")); // 0
        System.out.println(names.lastIndexOf("Kasun")); // 4
        System.out.println(names.contains("Nimal"));    // true
        System.out.println(names.contains("Sadun"));    // false

        Vector<String> customerNames = new Vector<>();
        customerNames.add("Nimal");
        customerNames.add("Supun");
        customerNames.add("Kasun");
        //customerNames.add("Upul");
        System.out.println(names.containsAll(customerNames)); // true

    }
}
