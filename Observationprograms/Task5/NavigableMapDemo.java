import java.util.NavigableMap;
import java.util.TreeMap;
import java.util.Map;

public class NavigableMapDemo {
    public static void main(String[] args) {

        // Create a NavigableMap using TreeMap
        NavigableMap<Integer, String> map = new TreeMap<>();

        map.put(10, "A");
        map.put(20, "B");
        map.put(30, "C");
        map.put(40, "D");

        System.out.println("Map: " + map);

        System.out.println("Lower Key: " + map.lowerKey(30));
        System.out.println("Floor Key: " + map.floorKey(30));
        System.out.println("Ceiling Key: " + map.ceilingKey(25));
        System.out.println("Higher Key: " + map.higherKey(30));

        System.out.println("First Entry: " + map.firstEntry());
        System.out.println("Last Entry: " + map.lastEntry());

        // Remove the first and last entries
        System.out.println("Poll First Entry: " + map.pollFirstEntry());
        System.out.println("Poll Last Entry: " + map.pollLastEntry());

        System.out.println("Map after polling: " + map);

        System.out.println("Descending Map: " + map.descendingMap());
    }
}
