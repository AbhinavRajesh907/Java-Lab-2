// Q18: Static Variable Object Counter
class Counter {
    static int count = 0;

    Counter() { count++; }
}

public class Q18_StaticCounter {
    public static void main(String[] args) {
        System.out.println("Create 3 objects");
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("Objects Created : " + Counter.count);
    }
}
