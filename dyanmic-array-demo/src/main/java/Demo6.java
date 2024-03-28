import java.util.ArrayList;

public class Demo6 {

    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Panadura");
        cityList.add("Galle");
        cityList.add("Rathnapura");
        cityList.add("Rakwana");
        cityList.add("Kandy");
        cityList.add("Kurunagala");
        cityList.add("Awissawella");
        cityList.add("Anuradhapura");

        ArrayList<String> lst = new ArrayList<>();
        lst.add("Galle");
        lst.add("Colombo");
        lst.add("Gampaha");
        lst.add("Kandy");

        boolean removed = cityList.removeAll(lst);
        System.out.println(removed);
        System.out.println(cityList);
    }
}
