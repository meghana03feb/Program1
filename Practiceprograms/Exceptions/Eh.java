package core_java;

public class Eh {
    public static void main(String[] args) {
    	int i=5,j=0;
        try{
        	int k=(i+3)/j;
            System.out.println("k value is: " +k);
        }catch(ArithmeticException ae) {
        	System.out.println("take another value of j expect 0");
        }finally {
        	System.out.println("j does not accept 0");
        }
    }
}
