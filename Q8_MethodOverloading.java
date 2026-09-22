// Q8: Method Overloading display()
import java.util.Scanner;

class PrintService {
    void display(int val) { System.out.print("Integer : " + val + " "); }
    void display(double val) { System.out.print("Double : " + val + " "); }
    void display(String val) { System.out.println("String : " + val); }
}

public class Q8_MethodOverloading {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Integer: ");
        int i = sc.nextInt();
        System.out.print("Double: ");
        double d = sc.nextDouble();
        System.out.print("String: ");
        String s = sc.next();

        PrintService ps = new PrintService();
        ps.display(i);
        ps.display(d);
        ps.display(s);
    }
}
