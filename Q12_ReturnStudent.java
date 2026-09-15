// Q12: Method Returning a Student Object
import java.util.Scanner;

class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    static Student createStudent(String name, int mark) {
        return new Student(name, mark);
    }

    void display() {
        System.out.println("Student Name : " + name + " Mark : " + mark);
    }
}

public class Q12_ReturnStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Mark: ");
        int mark = sc.nextInt();

        Student s = Student.createStudent(name, mark);
        s.display();
    }
}
