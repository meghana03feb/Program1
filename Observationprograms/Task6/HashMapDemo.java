import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Ananya");
        students.put(102, "Kiran");
        students.put(103, "Meera");

        System.out.println("HashMap: " + students);

        // Getting a value
        System.out.println("Value for key 102: " + students.get(102));

        // Checking key and value
        System.out.println("Contains key 101: "
                + students.containsKey(101));

        System.out.println("Contains value Meera: "
                + students.containsValue("Meera"));

        // Displaying keys
        System.out.println("Keys: " + students.keySet());

        // Displaying values
        System.out.println("Values: " + students.values());

        // Displaying entries
        System.out.println("Entries: " + students.entrySet());

        // getOrDefault()
        System.out.println("Key 105: "
                + students.getOrDefault(105, "Not Found"));

        // Size and empty check
        System.out.println("Size: " + students.size());
        System.out.println("Is Empty: " + students.isEmpty());

        // Removing an entry
        students.remove(103);
        System.out.println("After remove(): " + students);

        // Clearing map
        students.clear();
        System.out.println("After clear(): " + students);
    }
}
