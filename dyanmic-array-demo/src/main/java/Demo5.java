import java.util.ArrayList;

public class Demo5 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kasun");
        names.add("Nuwan");
        names.add("Ruwan");
        names.add("Supun");
        names.add("Kamal");
        names.add("Nimal");
        names.add("Kasun");

        String removedValue = names.remove(2);
        System.out.println(removedValue);       // Ruwan
        System.out.println(names);

        System.out.println(names.remove("Kasun"));  // True
        System.out.println(names);

        System.out.println(names.remove("Upul"));   // False
        names.remove(100);
    }
}
