// Q15: Recursive Sum of First N Natural Numbers
import java.util.Scanner;

public class Q15_SumNaturalNumbers {
    static int sum(int n) {
        if (n <= 1) return n;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Sum = " + sum(n));
    }
}
