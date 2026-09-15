// Q17: Access Control (Getters/Setters)
import java.util.Scanner;

class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

public class Q17_AccessControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Age: ");
        int age = sc.nextInt();

        Student s = new Student();
        s.setName(name);
        s.setAge(age);

        System.out.println("Student Name : " + s.getName() + " Age : " + s.getAge());
    }
}
