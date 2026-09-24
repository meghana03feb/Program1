import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    public static void main(String[] args) {

        LinkedHashSet<String> fruits = new LinkedHashSet<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Apple");

        System.out.println("LinkedHashSet: " + fruits);

        // Checking an element
        System.out.println("Contains Mango: "
                + fruits.contains("Mango"));

        // Finding size
        System.out.println("Size: " + fruits.size());

        // Removing an element
        fruits.remove("Banana");
        System.out.println("After remove(): " + fruits);

        // Clearing all elements
        fruits.clear();
        System.out.println("After clear(): " + fruits);
    }
}
