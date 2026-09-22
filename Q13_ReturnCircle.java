// Q13: Method Returning Circle Object After Computing Area
import java.util.Scanner;

class Circle {
    double radius, area;

    Circle(double radius) { this.radius = radius; }

    static Circle computeAndCreate(double r) {
        Circle c = new Circle(r);
        c.area = Math.PI * r * r;
        return c;
    }

    void display() {
        System.out.printf("Radius = %.1f Area = %.2f\n", radius, area);
    }
}

public class Q13_ReturnCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        Circle c = Circle.computeAndCreate(r);
        c.display();
    }
}
