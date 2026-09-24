import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Adding elements
        queue.add(40);
        queue.add(20);
        queue.add(50);

        // Adding another element using offer()
        queue.offer(10);

        System.out.println("PriorityQueue: " + queue);

        // Viewing the head
        System.out.println("Peek: " + queue.peek());

        // Checking an element
        System.out.println("Contains 40: " + queue.contains(40));

        // Finding size
        System.out.println("Size: " + queue.size());

        // Removing a specific element
        queue.remove(50);
        System.out.println("After remove(50): " + queue);

        // Removing the highest-priority element
        System.out.println("Poll: " + queue.poll());

        System.out.println("Final Queue: " + queue);
    }
}
