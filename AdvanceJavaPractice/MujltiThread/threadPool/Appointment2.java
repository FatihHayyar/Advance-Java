package AdvanceJavaPractice.MujltiThread.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
Thread yaratmak cidden maliyetli bir olaydır. Her Thread için sistemde belli bir kaynak ayrılır.
Bu kaynaklar CPU, Hafıza gibi önemli olanlardır. Uygulamamız çalışırken belli miktarda bir Thread
ile sınırlandırmak isteyebiliriz.

Bu nedenle Thread havuzu oluşturup bu havuzu önceden oluşturulmuş ve kullanıma hazır Thread nesneleri
ile doldururuz. Böylece, performans kazanımı ve sistem kaynaklarının verimli kullanımını sağlayabiliriz.

Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir. 5 kişi için randevu alınmak isteniyor.
      Thread havuzu oluşturup işleri 3 threade yaptırınız.
*/
public class Appointment2 {
    public static void main(String[] args) {
        ExecutorService service= Executors.newFixedThreadPool(3);
String[] user={"Tolstoy", "Balza", "John Taravoltan", "Omer Seyfettin", "Myke Tyson"};
AppointmenCenter2 appointmenCenter2=new AppointmenCenter2();
for(String user1 : user){
    Mythread mythread=new Mythread(appointmenCenter2);
    service.execute(mythread);
}
service.shutdown();
    }
}
class Mythread extends Thread {
    private  AppointmenCenter2 center;

    public Mythread(AppointmenCenter2 center) {
        this.center = center;
    }

    @Override
    public void run() {
String thrread=Thread.currentThread().getName();
        System.out.println(thrread+" basladi");
        System.out.println("randevu tarihi "+center.getAppointmentDate());
        System.out.println(thrread+" isi bitirdi");
    }
}