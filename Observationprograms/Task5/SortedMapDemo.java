import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapDemo {
    public static void main(String[] args) {

        // TreeMap maintains keys in sorted order
        SortedMap<Integer, String> map = new TreeMap<>();

        map.put(103, "Charlie");
        map.put(101, "Alice");
        map.put(104, "David");
        map.put(102, "Bob");

        System.out.println("Sorted Map: " + map);

        System.out.println("First Key: " + map.firstKey());
        System.out.println("Last Key: " + map.lastKey());

        // Display different portions of the sorted map
        System.out.println("Head Map: " + map.headMap(103));
        System.out.println("Tail Map: " + map.tailMap(102));
        System.out.println("Sub Map: " + map.subMap(102, 104));

        System.out.println("Comparator: " + map.comparator());
    }
}
