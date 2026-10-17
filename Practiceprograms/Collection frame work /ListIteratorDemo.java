import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        ListIterator<String> it = colors.listIterator();

        System.out.println("Forward Traversal:");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward Traversal:");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }
}
