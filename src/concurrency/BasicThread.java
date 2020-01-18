package concurrency;

public class BasicThread extends Thread{
    @Override
    public void run() {
        System.out.println("Thread Start "+ Thread.currentThread().getName());

        try {
            Thread.sleep(1000);
            Processing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread End "+ Thread.currentThread().getName());
    }

    private void Processing() throws InterruptedException {
        System.out.println("Processing...");
        Thread.sleep(5000);
    }

    public static void main(String[] args) {
        Thread test = new BasicThread();
        test.start();
    }

}
