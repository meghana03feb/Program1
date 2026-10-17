import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(40);
        queue.add(10);
        queue.add(30);
        queue.add(20);

        System.out.println("Priority Queue: " + queue);
        System.out.println("Head: " + queue.peek());

        System.out.println("Removing elements:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
