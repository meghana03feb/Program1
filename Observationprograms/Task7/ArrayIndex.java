package core_java;
import java.util.Scanner;

public class ArrayIndex {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {  
        // 1. Ask the user for the array size dynamically  
        System.out.print("Enter the size of the array: ");  
        int size = scanner.nextInt();  
        int[] dynamicArray = new int[size];  

        // 2. Populate the array dynamically  
        System.out.println("Enter " + size + " integers to fill the array:");  
        for (int i = 0; i < size; i++) {  
            System.out.print("Element at index " + i + ": ");  
            dynamicArray[i] = scanner.nextInt();  
        }  

        // 3. Intentionally prompt for an invalid out-of-bounds index  
        System.out.println("\n--- Triggering the Exception ---");  
        System.out.print("Enter an out-of-bounds index to fetch (e.g., " + size + " or higher): ");  
        int invalidIndex = scanner.nextInt();  

        // This line will throw ArrayIndexOutOfBoundsException if the index is invalid  
        int value = dynamicArray[invalidIndex];   
        System.out.println("Value at index " + invalidIndex + " is: " + value);  

    } catch (ArrayIndexOutOfBoundsException e) {  
        System.err.println("\n[ERROR] Caught ArrayIndexOutOfBoundsException!");  
        System.err.println("Message: " + e.getMessage() + " is not a valid index for this array.");  
    } finally {  
        scanner.close();  
    }  
}

}
