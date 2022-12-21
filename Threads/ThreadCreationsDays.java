package Threads;

public class ThreadCreationsDays {
    public static void main(String[] args) {
        System.out.println("Current Thread "+Thread.currentThread().getName());//main

MyThread thread=new MyThread();
//thread.run();//sadece metot gibi calsir
thread.start();//thread sinifinda run metodunda yazilanlar calismaya baslar
// thread sınıfında run() metodunda yazılanlar işlenmeye başlar
// run() diyerekte çağırdığımızda method yine çalışıyor , start() ile çağırmamız
        // arasındaki fark : run() ile çağırıldığında thread değişmez sadece methos çalışır
        // start() da ise önce thread ayağa kalkar daha sonra içindeki run() metodu çalışır
MyRunnable myRunnable = new MyRunnable( );
Thread thread2=new Thread(myRunnable);
thread2.start();

// 3.yol isimsiz olarak Thread olusturma(interface)
        Thread thread3=new Thread(new Runnable() { //asagidakinin aynisi sadece class yapmadik new ile cagirdik
            @Override
            public void run() {
                System.out.println("currentThread "+Thread.currentThread().getName());
                System.out.println("isimsiz sinif yoluyla olusturulan thread");
            }
        });
//        thread3.setName("thread 3"); isim verebilirim
thread3.start();

//isimsiz thread 2.yol
        Thread thread4=new Thread(()->{
            System.out.println("Lambda ile yazildi");
        });
        thread4.start();
        System.out.println("Nihaha"); //hangi thread in once bitcegini bilemeyiz

    }
}
//1.yol Thread class ini extend ederek
class MyThread extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(100);//tercih etmeyiz bizi kurtarmaz
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Mythread calisiyor");
    }
}
//2.yol Runnable interface ini implement ederek
 class MyRunnable implements Runnable {


    @Override
    public void run() {
        System.out.println("MyRunnable calisiyor");
    }
}