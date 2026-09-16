package core_java;
class Student {
    int marks = 85;   // default
}

class College {
    void display(Student s) {
        System.out.println("Marks: " + s.marks);
    }
}

public class Main {
    public static void main(String[] args) {

        Student s = new Student();
        College c = new College();

        c.display(s);
    }
}
