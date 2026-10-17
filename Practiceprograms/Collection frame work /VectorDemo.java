import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();

        v.add(15);
        v.add(25);
        v.add(35);
        v.add(45);

        System.out.println("Vector: " + v);

        v.add(2, 30);
        System.out.println("After insertion: " + v);

        v.remove(Integer.valueOf(25));
        System.out.println("After removal: " + v);

        System.out.println("Size: " + v.size());
    }
}
