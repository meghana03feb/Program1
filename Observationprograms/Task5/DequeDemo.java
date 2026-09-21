import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {
    public static void main(String[] args) {

        // Create a Deque using ArrayDeque
        Deque<Integer> deque = new ArrayDeque<>();

        deque.addFirst(20);
        deque.addLast(30);

        deque.offerFirst(10);
        deque.offerLast(40);

        System.out.println("Deque: " + deque);

        System.out.println("PeekFirst(): " + deque.peekFirst());
        System.out.println("PeekLast(): " + deque.peekLast());

        // Remove elements from both ends
        System.out.println("RemoveFirst(): " + deque.removeFirst());
        System.out.println("RemoveLast(): " + deque.removeLast());

        System.out.println("After remove operations: " + deque);

        System.out.println("PollFirst(): " + deque.pollFirst());
        System.out.println("PollLast(): " + deque.pollLast());

        System.out.println("Final Deque: " + deque);
    }
}
