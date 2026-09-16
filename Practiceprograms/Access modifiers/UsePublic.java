package core_java;
public class Student {
    public static int marks = 95;

    public static void display() {
        System.out.println("Marks: " + marks);
    }
}

public class College {
    static void collegeInfo() {
        System.out.println("College Student");
    }
}

public class UsePublic  {
    public static void main(String[] args) {

        Student.display();
        College.collegeInfo();

    }
}
