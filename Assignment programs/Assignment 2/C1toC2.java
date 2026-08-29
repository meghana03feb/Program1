package core_java;
class C2 {
 private int a=10;   
void msg2() {
        System.out.println("Message from C2");
    }
}

class C1 extends C2 {
    void msg1() {
        System.out.println("Message from C1");
    }
    System.out.println(super.a);
}

public class C1toC2 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.msg2(); 
        obj.msg1(); 
    }
}
