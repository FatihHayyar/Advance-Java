package Threads;
//thread ler ayni kaynaga yatismek isterse ne olur
public class MultiThreading02 {
    public static int sayi=0;
    public static void main(String[] args) throws InterruptedException {
// ayri iki thread olusturup ayni kaynaga erismesini saglayalim
        //ilk thread
       Sayi thread1=new Sayi();
       thread1.start();
//       thread1.join(); dinamik bir cozum degil
       //2.thread
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                Sayi.sayiDegistir();
                System.out.println("thread2 calisti");
            }
        });
        thread2.start();
    }
}
class Sayi extends Thread{

    @Override
    public void run() {
       sayiDegistir();
    }

    public synchronized static void sayiDegistir(){//synchronized sirayla is yaptirir
    for(int i=0; i<1000;i++){
        MultiThreading02.sayi++;
    }
    System.out.println(MultiThreading02.sayi);
}

}