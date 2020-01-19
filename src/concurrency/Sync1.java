package concurrency;

public class Sync1 implements Runnable {
    static Sync1 t = new Sync1();
    static int i = 0;

    @Override
    public void run() {
        for (int j = 0; j < 10000000; j++) {
            synchronized (t) {
                i++;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(t);
        Thread t2 = new Thread(t);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(i);
    }
}



