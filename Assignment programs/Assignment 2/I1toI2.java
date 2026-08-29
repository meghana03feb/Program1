package core_java;
interface I2 {
    void msgI2();
}

interface I1 extends I2 {
    void msgI1();
}
class TestClass implements I1 {
    public void msgI2() {
        System.out.println("Message from I2");
    }
    public void msgI1() {
        System.out.println("Message from I1");
    }
}

public class I1toI2{
    public static void main(String[] args) {
        TestClass obj = new TestClass();
        obj.msgI2();
        obj.msgI1();
    }
}
