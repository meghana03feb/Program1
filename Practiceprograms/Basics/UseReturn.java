package javaprograms;

public class UseReturn {
	int demo(int i,String name,float f,int j) {
		System.out.println("name is " +name );
		System.out.println("float is "+f);
		return i+j;
	}
	
	public static void main(String[] args) {
		System.out.println("I use return keyword");
		UseReturn ur = new UseReturn();
	    int res= ur.demo(40,"vyshu",166.29f,40);
	    System.out.println("addition is " +res); 
		
}
}
