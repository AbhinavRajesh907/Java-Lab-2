// Q5: Invoke Multiple Constructors Using this()
import java.util.Scanner;

class Student {
    String name;
    int age;

    Student() {
        System.out.print("Default Constructor ");
    }

    Student(String name, int age) {
        this();
        System.out.print("Parameterized Constructor ");
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name + " Age : " + age);
    }
}

public class Q5_ConstructorChaining {
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
