// Q6: Request Garbage Collection using System.gc()
class Demo {
    Demo() {
        System.out.println("Object Created");
    }

    @Override
    @SuppressWarnings("removal")
    protected void finalize() {
        System.out.println("Object Destroyed");
    }
}

public class Q6_GarbageCollection {
    public static void main(String[] args) {
        Demo obj1 = new Demo();
        Demo obj2 = new Demo();

        obj1 = null;
        obj2 = null;

        System.out.println("Garbage Collection Requested");
        System.gc();

        try { Thread.sleep(1000); } catch (InterruptedException e) {}
    }
}
