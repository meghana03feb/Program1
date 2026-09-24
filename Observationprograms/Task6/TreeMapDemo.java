import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        // Adding key-value pairs
        students.put(103, "Meera");
        students.put(101, "Ananya");
        students.put(105, "Rahul");
        students.put(102, "Kiran");
        students.put(104, "Divya");

        System.out.println("TreeMap: " + students);

        // Getting a value
        System.out.println("Value for key 102: "
                + students.get(102));

        // Checking key and value
        System.out.println("Contains key 103: "
                + students.containsKey(103));

        System.out.println("Contains value Rahul: "
                + students.containsValue("Rahul"));

        // First and last keys
        System.out.println("First Key: " + students.firstKey());
        System.out.println("Last Key: " + students.lastKey());

        // Higher and lower keys
        System.out.println("Higher Key than 102: "
                + students.higherKey(102));

        System.out.println("Lower Key than 102: "
                + students.lowerKey(102));

        // Ceiling and floor keys
        System.out.println("Ceiling Key of 103: "
                + students.ceilingKey(103));

        System.out.println("Floor Key of 103: "
                + students.floorKey(103));

        // Displaying entries
        System.out.println("Entries: " + students.entrySet());

        // Removing an entry
        students.remove(105);
        System.out.println("After remove(): " + students);
    }
}
