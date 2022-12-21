package AdvanceJavaPractice.MujltiThread.synchronization;
//Multithreading programlamada birden fazla Thread aynı anda ortak bir kaynağa erişmeye çalışırsa
//istenmeyen sonuçlar oluşacaktır. Bu durumda threadlere sırayla erişim vermek gerekecektir.
// Bir thread kaynağı kullanıyorken diğerleri onu beklemelidirler. Bu "synchronized" keywordü ile sağlanır.
//synronized metot ve kaliplarda kullanilir
/*
Task: Bir randevu oluşturma uygulaması tasarlayınız.(AppoinmentCenter)
      Uygulama herbir talep için bir gün sonrasına tarih
      vermelidir.
*/

public class AppointmentMap {
    public static void main(String[] args) {
String[] users={"Tostoy","Viktor Hugo","Balzag","Dostoyevski","John Stimback"};
AppointmentCenter center=new AppointmentCenter();

for(String user : users){
    Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                Thread.currentThread().setName(user);
               String name= Thread.currentThread().getName();
                System.out.format("Sayın %-16s, Randevu tarihiniz: %10s \n", name, center.getAppointmentDate());

            }
        });

        thread.start();
    }}
}
