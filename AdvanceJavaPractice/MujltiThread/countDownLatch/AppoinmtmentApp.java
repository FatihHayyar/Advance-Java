package AdvanceJavaPractice.MujltiThread.countDownLatch;

import java.util.concurrent.CountDownLatch;

/*
Geri sayım tamamlanıncaya kadar CountDownLatch örneğinin "await()" metodunu çağıran tüm threadler bekletilir.
Geri sayım tamamlandığında bir anlamda kapı sürgüsü açılır ve bekleyen threadler işlemeye devam eder.
Örneğin "n" sayıda threadin işlerini bitirdiklerini bildirene kadar (yani her biri sayacı bir azaltana ve
nihayetinde sayacın değeri sıfıra ulaşana kadar) ana threadin bekletilmesi istediğimiz bir
durumda kullanılabilir.

Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir. Randevu tarihini veren threadlerden önce
      randevu öncesinde bazı işlemleri gerçekleştiren threadlerin
      çalışmasını sağlayınız.
 */
public class AppoinmtmentApp {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);
String[] user ={"Tolstoy", "Charles Dickens", "Viktor Hugo"};
AppointmentCenter center = new AppointmentCenter();
for (String users : user){
   Thread thread= new Thread(new Runnable() {
       @Override
       public void run() {
           try {
               latch.await();
           } catch (InterruptedException e) {
               throw new RuntimeException(e);
           }
           System.out.println("randevu tarihi "+center.getAppointmentDate());
       }
   });
   thread.start();
}
Worker worker1=new Worker("a",latch);
Worker worker2=new Worker("b",latch);
Worker worker3=new Worker("c",latch);
worker1.start();
worker2.start();
worker3.start();

    }
}
