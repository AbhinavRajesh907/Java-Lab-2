// Q2: Parameterized Constructor in Employee Class
import java.util.Scanner;

class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name : " + name + " Employee Salary : " + salary);
    }
}

public class Q2_Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(name, salary);
        emp.display();
    }
}
