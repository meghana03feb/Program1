package core_java;
import java.util.Scanner;
public class Aioobe {
     public static void main(String[] args) {
    	 int[] arr= {1,2,3,4};
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enter i");
    	 int i = sc.nextInt();
    	try {
    		 int k=arr[i];
    		 System.out.println("array index stop at 3");
    	 }catch(ArrayIndexOutOfBoundsException ai){
    		 System.out.println("try again");
    	 }
     }
}
