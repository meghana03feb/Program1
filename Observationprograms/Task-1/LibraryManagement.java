package core_java;
interface Printable {
    void print();
}

// Part A & B: Book Class
class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    // Default Constructor
    Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0;
    }

    // Parameterized Constructor
    Book(int id, String name, String author, double price) {
        this.bookId = id;
        this.bookName = name;
        this.author = author;
        this.price = price;
    }

    public int getBookId() {
        return bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setBookId(int id) {
        bookId = id;
    }

    public void setBookName(String name) {
        bookName = name;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(double p) {
        price = p;
    }
}

// Part C: Inheritance
class Person {
    String name = "Meghana";
    int age = 19;
}

class Student extends Person {
    int rollNo = 101;

    void display() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
    }
}

class Faculty extends Person {
    String subject = "Java";

    void display() {
        System.out.println("Faculty Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
    }
}

// Part D: Method Overloading
class Area {
    double area(double radius) {
        return 3.14 * radius * radius;
    }

    int area(int side) {
        return side * side;
    }

    int area(int length, int breadth) {
        return length * breadth;
    }
}

// Method Overriding
class Vehicle {
    void display() {
        System.out.println("This is a Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car");
    }
}

class Bike extends Vehicle {
    void display() {
        System.out.println("This is a Bike");
    }
}

// Part E: Abstraction
abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}

// Interface
class Report implements Printable {
    public void print() {
        System.out.println("Printing Report");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        // Book Object
        Book b = new Book(101, "Java Programming", "James Gosling", 550);

        System.out.println("Book ID: " + b.getBookId());
        System.out.println("Book Name: " + b.getBookName());
        System.out.println("Author: " + b.getAuthor());
        System.out.println("Price: " + b.getPrice());

        // Inheritance
        Student s = new Student();
        s.display();

        Faculty f = new Faculty();
        f.display();

        // Method Overloading
        Area a = new Area();
        System.out.println("Area of Circle: " + a.area(5.0));
        System.out.println("Area of Square: " + a.area(4));
        System.out.println("Area of Rectangle: " + a.area(5, 6));

        // Method Overriding
      

        Car K = new Car();
        K.display();

        Bike B = new Bike();
        B.display();

        // Abstraction
        Circle c = new Circle();
        c.draw();

        Rectangle r = new Rectangle();
        r.draw();

        // Interface
        Report rep = new Report();
        rep.print();
    }
          }
