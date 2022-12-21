package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(2);

ThreadCreator thread1=new ThreadCreator("thread 1");
ThreadCreator thread2=new ThreadCreator("thread 2");
ThreadCreator thread3=new ThreadCreator("thread 3");
ThreadCreator thread4=new ThreadCreator("thread 4");
ThreadCreator thread5=new ThreadCreator("thread 5");
ThreadCreator thread6=new ThreadCreator("thread 6");
service.execute(thread1);
service.execute(thread2);
service.execute(thread3);
service.execute(thread4);
service.execute(thread5);
service.execute(thread6);
service.shutdown();
    }
}
class ThreadCreator extends Thread {
    private String name;

    public ThreadCreator(String name) {

        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("thread start "+name);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name + " stopp");
    }

}