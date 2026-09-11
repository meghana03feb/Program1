package core_java;
import java.util.InputMismatchException;
import java.util.Scanner ;
public class MultipleCatch {
      public static void main(String[] args) {
    	  System.out.println("enter 2 numbers:"); 
    	  try {
    	  Scanner sc= new Scanner(System.in);
    	  int x=sc.nextInt();
    	  int y=sc.nextInt();
    	  int z=x/y;
    	  System.out.println("z value is : "+z);
    	  }catch(ArithmeticException a) {
    		     System.out.println("y cannot be 0");
    	  }catch(InputMismatchException ie) {
    		  System.out.println("x and y values always be integers");
    	  }
    	  }
      }
