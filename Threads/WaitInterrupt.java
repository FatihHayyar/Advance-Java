package Threads;

public class WaitInterrupt {
    static public int balance=0;
    public static void main(String[] args) {
WaitInterrupt obje=new WaitInterrupt();
Thread thread1=new Thread(new Runnable() {
    @Override
    public void run() {
        obje.withdraw(1000);
    }
});
thread1.setName("withdraw thread");
thread1.start();
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                obje.depozit(2000);
                thread1.interrupt(); //burda thread 2 burda thread 1 i sonlandiriyor
            }
        });
        thread2.setName("depozit thread");
        thread2.start();

    }
public void  withdraw(int amount){
synchronized (this){
    if (balance<amount){
        System.out.println("beklemede");
        try {
            wait();
        } catch (InterruptedException e) {
//           e.printStackTrace();
            balance-=amount;
            System.out.println("basarili");
        }
    }

}
}
public void depozit(int amount){
        balance+=amount;
    System.out.println("para yatirildi");

}
}
