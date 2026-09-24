import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet<String> cities = new HashSet<>();

        // Adding elements
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Delhi");

        System.out.println("HashSet: " + cities);

        // Checking element
        System.out.println("Contains Mumbai: "
                + cities.contains("Mumbai"));

        // Size
        System.out.println("Size: " + cities.size());

        // Checking empty
        System.out.println("Is Empty: " + cities.isEmpty());

        // Removing element
        cities.remove("Chennai");
        System.out.println("After remove(): " + cities);

        // Clearing set
        cities.clear();
        System.out.println("After clear(): " + cities);
    }
}
