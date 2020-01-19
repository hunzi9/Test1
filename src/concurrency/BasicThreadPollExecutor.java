package concurrency;

import java.util.concurrent.*;

class RejectedExecutionHandlerImpl implements RejectedExecutionHandler{

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
        System.out.println(r.toString() + " is rejected");
    }
}

class MyMontitorThread implements Runnable {
    private ThreadPoolExecutor executor;
    private int delay;
    private boolean run = true;

    public MyMontitorThread(ThreadPoolExecutor executor,int delay){
        this.executor = executor;
        this.delay=delay;
    }

    public void shutdown(){
        this.run = false;

    }
    @Override
    public void run() {
        while (run){
            System.out.println(
                    String.format("[Monitor][%d/%d]Active:%d,Completed:%d, " +
                            "Task: %d, isShutdown: %s, isTerminated: %s",
                    this.executor.getPoolSize(),
                    this.executor.getCorePoolSize(),
                    this.executor.getActiveCount(),
                    this.executor.getCompletedTaskCount(),
                    this.executor.getTaskCount(),
                    this.executor.isShutdown(),
                    this.executor.isTerminated())
            );

            try {
                TimeUnit.SECONDS.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Worker implements Runnable {
    private String command;

    public Worker(String command) {
        this.command = command;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Start.Command " + command);
        process();
        System.out.println(Thread.currentThread().getName() + " End ");

    }

    private void process() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return this.command;
    }
}


    public class BasicThreadPollExecutor {
        public static void main(String[] args) throws InterruptedException {
            RejectedExecutionHandler rejectedHandler = new RejectedExecutionHandlerImpl();
            ThreadFactory threadFactory = Executors.defaultThreadFactory();
            ThreadPoolExecutor pool = new ThreadPoolExecutor(2,4,10,
                    TimeUnit.SECONDS,new ArrayBlockingQueue<>(2),threadFactory,rejectedHandler);

            MyMontitorThread monitortask = new MyMontitorThread(pool,3);
            Thread monitor = new Thread(monitortask);
            monitor.start();

            for(int i = 0;i <10; i ++){
                pool.execute(new Worker("cmd" + i));

            }

            Thread.sleep(30000);
            pool.shutdown();
            Thread.sleep(5000);
            monitortask.shutdown();
        }
}
