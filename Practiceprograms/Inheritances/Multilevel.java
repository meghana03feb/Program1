package javaprograms;
class Sup{       
    int a=35;
 void mul() {
	   float x=20.3f;
	   System.out.println("multiplication is" + x*30);
	 }
}
class Sub2 extends Sup{
    String s="good";
    int a=45;
    void add() {
  	   System.out.println("addition is" + (this.a+super.a));
  	   System.out.println("string is " +s);
    }
     }
class Sub1 extends Sub2{
	void add() {
		int b=10;
		System.out.println("add is" + (b+super.a));
		
	}
     
}
public class Multilevel {
	public static void main(String[] args) {
		   Sub1 s=new Sub1();
		   s.add();
		   s.mul();
	}

}
