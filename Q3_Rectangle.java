// Q3: Constructor Overloading (Rectangle Class)
import java.util.Scanner;

class Rectangle {
    int length, breadth;

    Rectangle() {
        this.length = 1;
        this.breadth = 1;
    }

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    int getArea() {
        return length * breadth;
    }
}

public class Q3_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length: ");
        int l = sc.nextInt();
        System.out.print("Breadth: ");
        int b = sc.nextInt();

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(l, b);

        System.out.println("Rectangle 1 Area = " + r1.getArea() + " Rectangle 2 Area = " + r2.getArea());
    }
}
