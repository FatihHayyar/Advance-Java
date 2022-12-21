package Threads;
//HAngi durumlarda deadlock olur
public class DeadLockDemo {
    public static void main(String[] args) {
final String lock1="Lock1";
final String lock2="Lock2";
Thread thread1=new Thread(new Runnable() {
    @Override
    public void run() {
        synchronized (lock1){
            System.out.println("Thread1 lock1 i kitledi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2){
                System.out.println("Thread1 lock2 i kitledi");
            }
        }
    }
});
thread1.start();

Thread thread2=new Thread(new Runnable() {
    @Override
    public void run() {
        synchronized (lock1){
            System.out.println("Thread2 lock1 i kitledi");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (lock2){
                System.out.println("Thread2 lock2 i kitledi");
            }
        }
    }
});
thread2.start();
    }
}
