import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements at both ends
        deque.addFirst("Java");
        deque.addLast("Python");

        System.out.println("Deque: " + deque);

        // Adding using offer methods
        deque.offerFirst("C");
        deque.offerLast("JavaScript");

        System.out.println("After offer methods: " + deque);

        // Viewing first and last elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // Removing from both ends
        System.out.println("Poll First: " + deque.pollFirst());
        System.out.println("Poll Last: " + deque.pollLast());

        System.out.println("Final Deque: " + deque);
    }
}
