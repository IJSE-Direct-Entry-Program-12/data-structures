import java.util.ArrayList;

public class Demo7 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Kasun Sampath");
        names.add("Suranga Lakmal");
        names.add("Ramindu Sampath");
        names.add("Lakmal Hewage");
        names.add("Upul Shantha");
        names.add("Saranga Dissanayake");

        //names.removeIf(name -> name.contains("Lakmal"));
        names.removeIf(name -> name.startsWith("S"));
        System.out.println(names);

        names.clear();
        System.out.println(names);
    }
}
