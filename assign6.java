import java.util.*;

class Student {
    String name;
    int rollNo;
    float marks;

    void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextInt();
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }

    void displayResult() {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

class Book {
    String title, author;
    double price;

    Book(String t) {
        title = t;
        author = "Unknown";
        price = 0;
    }

    Book(String t, String a) {
        title = t;
        author = a;
        price = 0;
    }

    Book(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void displayDetails() {
        System.out.println("\n--- Book Details ---");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.inputData();
        s1.displayResult();

        Book b1 = new Book("Java Basics");
        Book b2 = new Book("OOP in Java", "ABC");
        Book b3 = new Book("Advanced Java", "XYZ", 450);

        b1.displayDetails();
        b2.displayDetails();
        b3.displayDetails();
    }
}
