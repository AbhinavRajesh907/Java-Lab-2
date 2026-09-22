// Q9: Method Overloading area()
import java.util.Scanner;

class ShapeArea {
    int area(int side) { return side * side; }
    int area(int length, int breadth) { return length * breadth; }
}

public class Q9_AreaOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Side: ");
        int side = sc.nextInt();
        System.out.print("Length: ");
        int length = sc.nextInt();
        System.out.print("Breadth: ");
        int breadth = sc.nextInt();

        ShapeArea sa = new ShapeArea();
        System.out.println("Area of Square = " + sa.area(side) + " Area of Rectangle = " + sa.area(length, breadth));
    }
}
