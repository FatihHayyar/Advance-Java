package Threads;

public class WaitNotify {
    public static int balance = 0;

    public static void main(String[] args) {
WaitNotify thread = new WaitNotify();
Thread threads=new Thread(new Runnable() {
    @Override
    public void run() {
        thread.withDraw(500);
    }
});
threads.start();
        Thread threads1=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                thread.balance(1500);
            }
        });
threads1.start();
    }
    public void withDraw(int amount) {
        synchronized (this) {
            if (balance < amount){
                System.out.println("bekliyoruz");
            }else{
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
balance-=amount;
        System.out.println("para cekildi "+balance);
    }
    public void balance(int amount) {
        balance+=amount;
        System.out.println("para yatirildi "+balance);
        synchronized (this) {
            notify();
        }
    }


}
