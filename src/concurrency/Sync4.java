package concurrency;

public class Sync4 {
    public static void main(String[] args) throws InterruptedException {
        SyncComputing pt = new SyncComputing();

        Thread t1 = new Thread(pt,"t1");
        t1.start();
        Thread t2 = new Thread(pt,"t2");
        t2.start();

        t1.join();
        t2.join();
        System.out.println(" result count: " + pt.getCount());
    }

}

class SyncComputing implements Runnable {
    private int count;
    private final Object mutex = new Object();

    @Override
    public void run() {
        for (int i = 1; i < 5; i++) {
            process(i);
            synchronized (mutex) {
                count++;
                System.out.println(Thread.currentThread().getName() + " processing " + i + " After Count " + this.count);
            }
        }
    }
    private void process(int i) {
        try {
            System.out.println(Thread.currentThread().getName() + " processing " + i + " Before Count " + this.count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int getCount() {
        return count;
    }
}