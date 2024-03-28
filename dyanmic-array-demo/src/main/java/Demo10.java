import javafx.collections.FXCollections;
import javafx.collections.ListChangeListener;
import javafx.collections.ObservableList;

import java.util.ArrayList;

public class Demo10 {

    public static void main(String[] args) {
        ArrayList<String> alNameList = new ArrayList<>();
        alNameList.add("Kasun");
        alNameList.add("Nuwan");
        alNameList.add("Ruwan");

        ObservableList<String> olNameList = FXCollections.observableArrayList();
        olNameList.addListener((ListChangeListener<String>) change ->
                System.out.println("Subscriber1: " + change));
        olNameList.addListener((ListChangeListener<String>) change ->
                System.out.println("Subscriber2: " + change));

        olNameList.add("Kasun");
        olNameList.add("Nuwan");
        olNameList.add("Ruwan");
        olNameList.remove(1);
    }
}
