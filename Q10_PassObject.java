// Q10: Pass Object to Method
import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }
}

class DisplayService {
    void printDetails(Student s) {
        System.out.println("Student Name : " + s.name + " Roll No : " + s.rollNo);
    }
}

public class Q10_PassObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Roll No: ");
        int rollNo = sc.nextInt();

        Student s = new Student(name, rollNo);
        DisplayService ds = new DisplayService();
        ds.printDetails(s);
    }
}
