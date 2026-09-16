package core_java;
import java.util.Scanner;
public class UsingThrow {
     public static void main(String[] args){
    	 System.out.println("enter v value:");
       try {
    	 Scanner sc = new Scanner(System.in);
         int v=sc.nextInt();
           if(v==5) {
        	   throw new Exception("THE value of v is cannot be 5");
           }else {
        	   System.out.println("satisfied");
           }
       }catch(Exception e) {
    	   System.out.println("e.getMessage");
       }
    	 
    	 
     }
}
