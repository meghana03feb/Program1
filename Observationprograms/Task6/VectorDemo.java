import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {

        Vector<String> subjects = new Vector<>();

        // Adding elements
        subjects.add("Java");
        subjects.add("C");
        subjects.addElement("Python");

        System.out.println("Vector: " + subjects);

        // Accessing element
        System.out.println("Element at index 1: " + subjects.get(1));

        // Replacing element
        subjects.set(1, "C++");
        System.out.println("After set(): " + subjects);

        // Removing by index
        subjects.remove(0);
        System.out.println("After remove(index): " + subjects);

        // Adding another element
        subjects.add("JavaScript");

        // Removing by object
        subjects.removeElement("Python");
        System.out.println("After removeElement(): " + subjects);

        // Size and capacity
        System.out.println("Size: " + subjects.size());
        System.out.println("Capacity: " + subjects.capacity());

        // Checking element
        System.out.println("Contains JavaScript: "
                + subjects.contains("JavaScript"));
    }
}
