// Q7: Demonstrate finalize() Method
class Test {
    Test() {
        System.out.println("Object Created");
    }

    @Override
    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("finalize() method called");
    }
}

public class Q7_FinalizeMethod {
    public static void main(String[] args) {
        Test t = new Test();
        t = null;

        System.gc();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}
