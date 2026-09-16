package core_java;
public class UsePublic {
    public static int marks = 95;

    public static void main(String[] args) {
        College.display();
    }
}

class College {
    static void display() {
        System.out.println("Marks: " + Student.marks);
    }
}
