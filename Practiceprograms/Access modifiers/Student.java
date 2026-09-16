class College {
    void display(Student s) {
        s.showMarks();
    }
}

class Test {
    void testStudent(Student s) {
        System.out.println("Testing student...");
        s.showMarks();
    }
}

public class Student {
    private int marks = 90;

    void showMarks() {
        System.out.println("Marks: " + marks);
    }

    public static void main(String[] args) {
        Student s = new Student();
        College c = new College();
        Test t = new Test();

        c.display(s);
        t.testStudent(s);
    }
}
