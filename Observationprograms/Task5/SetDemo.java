import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        // Create a Set using HashSet
        Set<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);

        System.out.println("Set: " + set);

        // Duplicate values are not stored in a Set
        System.out.println("Contains 20: " + set.contains(20));
        System.out.println("Size: " + set.size());
        System.out.println("Is Empty: " + set.isEmpty());

        set.remove(10);
        System.out.println("After remove(10): " + set);

        set.clear();
        System.out.println("After clear(): " + set);
    }
}
