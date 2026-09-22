// Q11: Pass Objects to Compare Box Volume
import java.util.Scanner;

class Box {
    int length, width, height;

    Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    int getVolume() { return length * width * height; }

    static void displayLarger(Box b1, Box b2) {
        int v1 = b1.getVolume();
        int v2 = b2.getVolume();
        System.out.println("Larger Box Volume = " + ((v1 > v2) ? v1 : v2));
    }
}

public class Q11_CompareBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Box1: ");
        Box b1 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.print("Box2: ");
        Box b2 = new Box(sc.nextInt(), sc.nextInt(), sc.nextInt());

        Box.displayLarger(b1, b2);
    }
}
