import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(30);
        numbers.add(10);
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);

        System.out.println("TreeSet: " + numbers);

        // Checking an element
        System.out.println("Contains 30: " + numbers.contains(30));

        // First and last elements
        System.out.println("First element: " + numbers.first());
        System.out.println("Last element: " + numbers.last());

        // Higher and lower elements
        System.out.println("Higher than 30: " + numbers.higher(30));
        System.out.println("Lower than 30: " + numbers.lower(30));

        // Ceiling and floor elements
        System.out.println("Ceiling of 25: " + numbers.ceiling(25));
        System.out.println("Floor of 25: " + numbers.floor(25));

        // Removing an element
        numbers.remove(20);
        System.out.println("After remove(): " + numbers);

        // Removing first and last elements
        System.out.println("Poll First: " + numbers.pollFirst());
        System.out.println("Poll Last: " + numbers.pollLast());

        System.out.println("Final TreeSet: " + numbers);
    }
}
