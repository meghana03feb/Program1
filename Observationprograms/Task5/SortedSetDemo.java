import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {

        // TreeSet maintains elements in sorted order
        SortedSet<Integer> set = new TreeSet<>();

        set.add(40);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println("Sorted Set: " + set);

        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // Display different portions of the sorted set
        System.out.println("HeadSet(30): " + set.headSet(30));
        System.out.println("TailSet(20): " + set.tailSet(20));
        System.out.println("SubSet(20,40): " + set.subSet(20, 40));

        System.out.println("Comparator: " + set.comparator());
    }
}
