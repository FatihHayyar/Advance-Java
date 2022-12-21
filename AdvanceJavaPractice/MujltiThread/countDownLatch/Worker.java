package AdvanceJavaPractice.MujltiThread.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
private String name;
CountDownLatch latch;

    public Worker(String name, CountDownLatch latch) {
        this.name = name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(name+" basladi");
        System.out.println(name+" devam ediyor");
        System.out.println(name+" bitirdi");
        latch.countDown();
    }
}
