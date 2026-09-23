import java.util.Scanner;

class Student {

    private int rollNo;
    private String name;
    private int[] marks;

    Student(int rollNo, String name, int[] marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    int calculateTotal() {
        int total = 0;

        // Calculate total marks using the array
        for (int mark : marks) {
            total += mark;
        }

        return total;
    }

    double calculateAverage() {
        return (double) calculateTotal() / marks.length;
    }

    int findHighest() {
        int highest = marks[0];

        // Find the highest mark
        for (int mark : marks) {
            highest = Math.max(highest, mark);
        }

        return highest;
    }

    int findLowest() {
        int lowest = marks[0];

        // Find the lowest mark
        for (int mark : marks) {
            lowest = Math.min(lowest, mark);
        }

        return lowest;
    }

    double calculatePercentage() {
        return ((double) calculateTotal() / (marks.length * 100)) * 100;
    }

    String getGrade() {
        double percentage = calculatePercentage();

        if (percentage >= 90)
            return "A+";
        else if (percentage >= 80)
            return "A";
        else if (percentage >= 70)
            return "B";
        else if (percentage >= 60)
            return "C";
        else if (percentage >= 50)
            return "D";
        else
            return "F";
    }

    String getRemark() {
        String grade = getGrade();

        switch (grade) {
            case "A+":
                return "Outstanding Performance";
            case "A":
                return "Excellent Performance";
            case "B":
                return "Very Good Performance";
            case "C":
                return "Good Performance";
            case "D":
                return "Satisfactory Performance";
            default:
                return "Needs Improvement";
        }
    }

    void displayDetails() {
        String formattedName = name.trim().toUpperCase();

        // Round percentage to two decimal places
        double percentage = Math.round(calculatePercentage() * 100.0) / 100.0;

        System.out.println("\n----- STUDENT PERFORMANCE REPORT -----");
        System.out.println("Roll Number     : " + rollNo);
        System.out.println("Student Name    : " + formattedName);
        System.out.println("Name Length     : " + formattedName.length());
        System.out.println("Total Marks     : " + calculateTotal());
        System.out.println("Average Marks   : " + calculateAverage());
        System.out.println("Highest Mark    : " + findHighest());
        System.out.println("Lowest Mark     : " + findLowest());
        System.out.println("Percentage      : " + percentage + "%");
        System.out.println("Grade           : " + getGrade());

        if (percentage >= 50)
            System.out.println("Result          : PASS");
        else
            System.out.println("Result          : FAIL");

        System.out.println("Remark          : " + getRemark());
    }
}

public class StudentPerformanceAnalysis {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        int[] marks = new int[5];

        System.out.println("Enter marks for 5 subjects:");

        for (int i = 0; i < marks.length; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
        }

        Student student = new Student(rollNo, name, marks);

        student.displayDetails();

        sc.close();
    }
}
