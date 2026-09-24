import java.util.Enumeration;
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {

        Hashtable<Integer, String> students = new Hashtable<>();

        // Adding key-value pairs
        students.put(101, "Aarav");
        students.put(102, "Sneha");
        students.put(103, "Vikram");

        System.out.println("Hashtable: " + students);

        // Getting a value
        System.out.println("Value for key 102: "
                + students.get(102));

        // Checking key and value
        System.out.println("Contains key 101: "
                + students.containsKey(101));

        System.out.println("Contains value Sneha: "
                + students.containsValue("Sneha"));

        // Displaying keys using Enumeration
        System.out.print("Keys: ");
        Enumeration<Integer> keys = students.keys();

        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }

        System.out.println();

        // Displaying values using Enumeration
        System.out.print("Values: ");
        Enumeration<String> values = students.elements();

        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }

        System.out.println();

        // Size and empty check
        System.out.println("Size: " + students.size());
        System.out.println("Is Empty: " + students.isEmpty());

        // Removing an entry
        students.remove(103);
        System.out.println("After remove(): " + students);
    }
}
