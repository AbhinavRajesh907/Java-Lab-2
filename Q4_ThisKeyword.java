// Q4: Distinguish Local and Instance Variables Using 'this'
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Student Name : " + name + " Age : " + age);
    }
}

public class Q4_ThisKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student s = new Student(name, age);
        s.display();
    }
}
