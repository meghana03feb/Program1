package core_java;

// Interface I1
interface I1 {
    void display();
    default void startSystem() {
        System.out.println("Initializing system hardware...");
        logAction(); // Calling the private interface method
    }

    //  Private method inside the interface
    private void logAction() {
        System.out.println("Internal Log: Connection verified successfully.");
    }
}

// Class C1 implementing Interface I1
class C1 implements I1 {
    // Overriding the abstract method
    public void display() {
        System.out.println("Class C1 dashboard is now active.");
    }
}

// Execution Class
public class C1toI1 {
    public static void main(String[] args) {
        C1 obj = new C1();
        
        obj.startSystem(); 
        obj.display();     
    }
}
