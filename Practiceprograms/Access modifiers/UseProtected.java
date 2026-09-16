package core_java;
class Student {
    protected int marks = 80;
}

class Test extends Student {
    void display() {
        System.out.println("Marks: " + marks);
    }
}

public class UseProtected{
    public static void main(String[] args) {
        Test t = new Test();

        t.display();
    }
}
