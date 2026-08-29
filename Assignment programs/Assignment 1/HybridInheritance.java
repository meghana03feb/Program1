package core_java;
interface A {
    void msg1();
}
interface B extends A {
    void msg2();
}

interface C extends A {
    void msg3();
} 
class D implements B, C {

    // From Interface A
    public void msg1() {
        System.out.println("Message 1");
    }

    // From Interface B
    public void msg2() {
        System.out.println("Message 2");
    }

    // From Interface C
    public void msg3() {
        System.out.println("Message 3");
    }

    // Local method in Class D
    void msg4() {
        System.out.println("Message 4");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        D obj = new D();
        
        obj.msg1();
        obj.msg2();
        obj.msg3();
        obj.msg4();
    }
}
