package AdvanceJavaPractice.MujltiThread.semaphorex;

import java.util.concurrent.Semaphore;

/*
Semaphore bir kaynağa erişebilen iş parçacığı sayısını kısıtlamak için kullanılır.
Yani, synchronized sadece bir iş parçacığının kilitlenmesi ve
senkronize blok / yöntemi yürütmesine izin verirken, Semaphore n iş parçacığına kadar izin verir
ve diğerlerini engeller.

senaryo:deneme kabini/ödeme kasası
Mağazanın 3 deneme kabini var. 5 kişi mağazanın deneme kabinini
kullanmak istiyor. Bu 5 tane işlem için 5 thread kullanılsın.
*/
public class SemaphorePro {
    public static void main(String[] args) {
        Semaphore sema=new Semaphore(3);
Mythread mythread1=new Mythread("Fatih",sema);
Mythread mythread2=new Mythread("Gülüs",sema);
Mythread mythread3=new Mythread("Osman",sema);
Mythread mythread4=new Mythread("ümmus",sema);
Mythread mythread5=new Mythread("Betüs",sema);
mythread1.start();
mythread2.start();
mythread3.start();
mythread4.start();
mythread5.start();
    }
}
class Mythread extends Thread {
    private String name;
    Semaphore sema;

    public Mythread(String name, Semaphore sema) {
        this.name = name;
        this.sema = sema;
    }

    @Override
    public void run() {
        try {
            sema.acquire();
            System.out.println(name+" kiyafetini deniyor");
            Thread.sleep(1000);
            System.out.println(name+" kabinden cikti");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        sema.release();

    }
}