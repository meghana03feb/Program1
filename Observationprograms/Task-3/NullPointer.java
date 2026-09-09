package core_java;
public class NullPointer{
public static void main(String[] args) {

try {  
        String name = null;  

        System.out.println("Name: " + name);  

        // Trying to call a method on a null reference  
        System.out.println("Length: " + name.length());  

    } catch (NullPointerException e) {  
        System.out.println("Caught NullPointerException!");  
        System.out.println("Cannot perform an operation on a null object.");  
    }  
}

}
