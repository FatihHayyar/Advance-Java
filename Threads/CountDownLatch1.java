package Threads;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch1 {
    public static void main(String[] args) {
        CountDownLatch latch=new CountDownLatch(4);
WorkerThreads thread1=new WorkerThreads("worker1",10,latch);
WorkerThreads thread2=new WorkerThreads("worker2",30,latch);
WorkerThreads thread3=new WorkerThreads("worker3",50,latch);
WorkerThreads thread4=new WorkerThreads("worker4",70,latch);
thread1.start();
thread2.start();
thread3.start();
thread4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main metot bitti");
    }
}
class WorkerThreads extends Thread {
    private int delay;
    private CountDownLatch latch;

    public WorkerThreads(String name,int delay, CountDownLatch latch) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName()+" calisiyor");
            latch.countDown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}