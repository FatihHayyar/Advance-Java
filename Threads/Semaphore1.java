package Threads;

import java.util.concurrent.Semaphore;

public class Semaphore1 {
    public static void main(String[] args) {
Semaphore sem = new Semaphore(4);
        System.out.println("toplam park yeri "+sem.availablePermits());

        Car thread1=new Car("thread1",sem);
        thread1.start();
        Car thread2=new Car("thread2",sem);
        thread2.start();
        Car thread3=new Car("thread3",sem);
        thread3.start();
        Car thread4=new Car("thread4",sem);
        thread4.start();
        Car thread5=new Car("thread5",sem);
        thread5.start();
        Car thread6=new Car("thread6",sem);
        thread6.start();
    }
}
class Car extends Thread{
    private String name;
    Semaphore semaphore;

    public Car(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        try {

            semaphore.acquire();
            System.out.println(name+" parking");
            System.out.println(name+" parked");
            for(int i = 1; i <5;i++) {
                System.out.println(name+" parkta "+i+" saattir bekliyor");
                Thread.sleep(1000);

            }
            System.out.println(name+" park yerinden ayrildi");
            semaphore.release();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}