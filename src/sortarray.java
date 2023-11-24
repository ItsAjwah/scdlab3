import java.util.ArrayList;
import java.util.Collections;

public class sortarray {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // Add integers to the ArrayList
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(8);
        arrayList.add(1);
        arrayList.add(3);

        // Sort the ArrayList in ascending order
        Collections.sort(arrayList);

        // Display the sorted ArrayList
        System.out.println("Sorted ArrayList: " + arrayList);
    }
}
