import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Adding elements
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Viewing top element
        System.out.println("Top element: " + stack.peek());

        // Removing top element
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Stack after pop: " + stack);

        // Checking empty
        System.out.println("Is Empty: " + stack.empty());

        // Searching element
        System.out.println("Position of 10: " + stack.search(10));
    }
}
