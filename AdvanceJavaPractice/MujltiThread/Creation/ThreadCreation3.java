package AdvanceJavaPractice.MujltiThread.Creation;
//Task4: anonymous class kullanarak thread oluşturunuz.
//       lambda expression kullanarak thread oluşturunuz.
public class ThreadCreation3 {
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
Thread.currentThread().setName("ilk thread");
                System.out.println(Thread.currentThread().getName());
            }
        });

        Thread thread2=new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        });
        thread1.start();
        thread2.start();
    }
}
/*

1) Multithreading Programlama nedir?
    Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci

2) Threadler 2 şekilde oluşturulur:

        --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.

         --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
         ardından Thread sınıfının constructorına nesne olarak gönderilir.
2a) Hangi yöntem daha kullanışlı?
    Genellikle Runnable interfaceini implement ederek oluşturmak daha çok tercih
    edilir çünkü Javada sadece bir class extend edebiliriz bu hakkımızı Thread ile
    harcamak istemeyiz.

3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?

   Evet, ancak thread oluşturulmaz.

4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?

   Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.


*/