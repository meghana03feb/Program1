import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {

        LinkedHashMap<Integer, String> employees = new LinkedHashMap<>();

        // Adding key-value pairs
        employees.put(101, "Arjun");
        employees.put(102, "Divya");
        employees.put(103, "Nikhil");

        System.out.println("LinkedHashMap: " + employees);

        // Getting a value
        System.out.println("Value for key 102: "
                + employees.get(102));

        // Checking a key
        System.out.println("Contains key 101: "
                + employees.containsKey(101));

        // Displaying keys
        System.out.println("Keys: " + employees.keySet());

        // Displaying values
        System.out.println("Values: " + employees.values());

        // Displaying entries
        System.out.println("Entries: " + employees.entrySet());

        // Removing an entry
        employees.remove(103);
        System.out.println("After remove(): " + employees);
    }
}
