import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {

        // Create a list for forward and backward traversal
        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        ListIterator<Integer> itr = list.listIterator();

        System.out.println("Initial List: " + list);

        System.out.println("\nForward Traversal:");

        while (itr.hasNext()) {

            System.out.println("Element: " + itr.next());
            System.out.println("Next Index: " + itr.nextIndex());
            System.out.println("Previous Index: " + itr.previousIndex());
        }

        System.out.println("\nBackward Traversal:");

        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }

        // Modify and insert elements using ListIterator
        itr.next();
        itr.set(15);

        System.out.println("\nAfter set(): " + list);

        itr.add(12);

        System.out.println("After add(): " + list);

        itr.next();
        itr.remove();

        System.out.println("After remove(): " + list);
    }
}
