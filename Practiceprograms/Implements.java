package core_java;


	  interface I1{
		  double d = 202.2;
		  void abstractclass1();
		  
	  }
	  interface I2{ 
		  int i= 10;
		  void abstractclass3();
	  }
	  
	  public class Implements implements I1,I2{
		 public void abstractclass1() {
			  System.out.println("This is abstract class 1 \n" );
		  }
		   public void abstractclass3() {
			 System.out.println("This is abstract class 3 \n ");
	  }
		  public static void main(String[] args) {
	
		  Implements ai = new Implements();
		  ai.abstractclass1();
		  ai.abstractclass3();
}
	  }
