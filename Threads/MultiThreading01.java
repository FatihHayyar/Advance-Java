package Threads;

public class MultiThreading01 {
    public static void main(String[] args) throws InterruptedException {
long st1=System.currentTimeMillis();
        CounterWithoutMultiThread counter1=new CounterWithoutMultiThread(1);
CounterWithoutMultiThread counter2=new CounterWithoutMultiThread(2);
counter1.countMe();
        System.out.println("--------------------------------");
counter2.countMe();
long frk1=System.currentTimeMillis()-st1;
        System.out.println(frk1);

        long st2=System.currentTimeMillis();
        CounterWithMultiThread counter3=new CounterWithMultiThread(1);
        CounterWithMultiThread counter4=new CounterWithMultiThread(2);
        counter3.start();
        System.out.println("--------------------------------");
        counter4.start();
      counter3.join();//alttan gelene bekle demek
        counter4.join();

        long frk2=System.currentTimeMillis()-st2;
        System.out.println(frk2);




    }
}
class CounterWithoutMultiThread {
    private int threadNum;

    public CounterWithoutMultiThread(int threadNum) {
        this.threadNum = threadNum;
    }
    public void countMe( ){
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i"+i+" thread nummer "+threadNum);
        }
    }
}
class CounterWithMultiThread extends Thread{
    private int threadNum;

    public CounterWithMultiThread(int threadNum){
        this.threadNum = threadNum;
    }

    @Override
    public void run() {
       countMe();
    }

    public void countMe( ){
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("i"+i+" thread nummer "+threadNum);
        }
    }

}