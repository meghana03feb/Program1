import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {

        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        queue.add("A");
        queue.add("B");
        queue.offer("C");

        System.out.println("Queue: " + queue);

        System.out.println("Element(): " + queue.element());
        System.out.println("Peek(): " + queue.peek());

        // Remove elements from the front of the queue
        System.out.println("Remove(): " + queue.remove());
        System.out.println("After remove(): " + queue);

        System.out.println("Poll(): " + queue.poll());
        System.out.println("After poll(): " + queue);
    }
}
