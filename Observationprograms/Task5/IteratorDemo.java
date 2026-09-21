import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {

        // Create an ArrayList for iteration
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        Iterator<Integer> itr = list.iterator();

        System.out.println("Elements:");

        while (itr.hasNext()) {

            int value = itr.next();
            System.out.println(value);

            // Remove 20 safely using the iterator
            if (value == 20) {
                itr.remove();
            }
        }

        System.out.println("After remove(): " + list);

        System.out.println("Using forEachRemaining():");

        Iterator<Integer> itr2 = list.iterator();

        itr2.forEachRemaining(
            value -> System.out.println(value)
        );
    }
}
