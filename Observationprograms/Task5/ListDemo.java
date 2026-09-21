import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {

        // Create a List using ArrayList
        List<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(10);
        list.add(20);
        list.add(10);

        System.out.println("List: " + list);

        // Insert an element at index 1
        list.add(1, 15);
        System.out.println("After add(1,15): " + list);

        System.out.println("Element at index 2: " + list.get(2));

        list.set(2, 25);
        System.out.println("After set(): " + list);

        list.remove(1);
        System.out.println("After remove(): " + list);

        System.out.println("First index of 10: " + list.indexOf(10));
        System.out.println("Last index of 10: " + list.lastIndexOf(10));

        System.out.println("SubList: " + list.subList(1, 3));

        list.sort(Comparator.naturalOrder());
        System.out.println("After sort(): " + list);
    }
}
