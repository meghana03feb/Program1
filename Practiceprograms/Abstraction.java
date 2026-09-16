package core_java;
 abstract class Parent{
	int integer;
    public Parent(){
    	this.integer=10;
		System.out.println("INTERGER IS :" +this.integer);
		 
	 }
	 
	 abstract void student();
	 
 }
  class Child extends Parent{
	  public Child() {
		  System.out.println("i am a child");
	  }
	  
	  void student(){
		  int a =10;
		  System.out.println("student problem is :" +(a+10));
	  }
	  
  }
public class Abstraction {
	public static void main(String[] args) {
		Child ch=new Child();
		ch.student();
		
	}
    
}
