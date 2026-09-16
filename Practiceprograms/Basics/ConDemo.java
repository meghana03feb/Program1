package javaprograms;

public class ConDemo{
      int rn;
      String name;
      float per;
      public ConDemo() {
    	  rn=101;
    	  this.name="Suresh";
    	  this.per=230.20f;
    	  System.out.println("i use constructor");
   }
      void demo() {
    	  int x=6,y=7;
    	  System.out.println("addition is " + (x+y));
    	  System.out.println("Rollno is " + this.rn);
    	  System.out.println("Name is " + this.name);
    	  System.out.println("Percentage is " + this.per);
      }
      public static void main(String[] args) {
    	  System.out.println("hello World");
    	  ConDemo cd = new ConDemo();
    	  cd.demo();
    	  
      }
}
