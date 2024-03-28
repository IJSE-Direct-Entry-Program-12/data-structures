import java.util.ArrayList;
import java.util.Arrays;

public class AppInitializer {

    public static void main(String[] args) {
//        DynamicArray array = new DynamicArray();
//        array.print();  // []
//        array.add(10);
//        array.print();  // [10]
//        array.add(20);
//        array.print();  // [10,20]
//        array.add(30);
//        array.print();  // [10,20,30]
//        array.add(40);
//        array.add(50);
//        array.print();  // [10,20,30,40,50]

        ArrayList<Integer> array = new ArrayList<>();
        array.add(10);
        array.add(20);
        System.out.println(array);
    }
}

class DynamicArray{
    int[] array = new int[0];
    void add(int value){
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = value;
        array = newArray;
    }
    void print(){
        System.out.println(Arrays.toString(array));
    }
}
