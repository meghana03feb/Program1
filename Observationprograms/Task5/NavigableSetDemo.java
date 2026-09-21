import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {
    public static void main(String[] args) {

        // Create a NavigableSet using TreeSet
        NavigableSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);

        System.out.println("Set: " + set);

        System.out.println("Lower(30): " + set.lower(30));
        System.out.println("Floor(30): " + set.floor(30));
        System.out.println("Ceiling(25): " + set.ceiling(25));
        System.out.println("Higher(30): " + set.higher(30));

        // Remove the first and last elements
        System.out.println("PollFirst(): " + set.pollFirst());
        System.out.println("PollLast(): " + set.pollLast());

        System.out.println("Set after polling: " + set);

        System.out.println("Descending Set: " + set.descendingSet());
    }
}
