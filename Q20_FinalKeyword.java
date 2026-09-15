// Q20: Final Keyword for Constant PI
import java.util.Scanner;

class CircleCalculator {
    final double PI = 3.141592653589793;

    double calculateArea(double r) {
        return PI * r * r;
    }
}

public class Q20_FinalKeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Radius: ");
        double r = sc.nextDouble();

        CircleCalculator cc = new CircleCalculator();
        System.out.printf("Area = %.2f\n", cc.calculateArea(r));
    }
}
