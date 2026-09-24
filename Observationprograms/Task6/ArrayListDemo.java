import java.util.ArrayList;
import java.util.Comparator;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(30);
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);

        System.out.println("Original List: " + numbers);

        // Adding element at a specific index
        numbers.add(1, 40);
        System.out.println("After add(index, element): " + numbers);

        // Getting an element
        System.out.println("Element at index 2: " + numbers.get(2));

        // Replacing an element
        numbers.set(2, 50);
        System.out.println("After set(): " + numbers);

        // Removing using index
        numbers.remove(1);
        System.out.println("After remove(index): " + numbers);

        // Removing using object
        numbers.remove(Integer.valueOf(10));
        System.out.println("After remove(object): " + numbers);

        // Checking an element
        System.out.println("Contains 50: " + numbers.contains(50));

        // Size
        System.out.println("Size: " + numbers.size());

        // Checking empty
        System.out.println("Is Empty: " + numbers.isEmpty());

        // Finding first occurrence
        System.out.println("First index of 10: " + numbers.indexOf(10));

        // Finding last occurrence
        System.out.println("Last index of 10: " + numbers.lastIndexOf(10));

        // Sorting
        numbers.sort(Comparator.naturalOrder());
        System.out.println("Sorted List: " + numbers);

        // Clearing list
        numbers.clear();
        System.out.println("After clear(): " + numbers);
    }
}
