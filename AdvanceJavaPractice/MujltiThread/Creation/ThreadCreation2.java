package AdvanceJavaPractice.MujltiThread.Creation;
//Task2:Runnable interfaceni implement eden Counter isminde sınıf oluşturup
// bu sınıftan harfleri a dan z ye kadar yazdıran iki tane thread oluşturunuz.
public class ThreadCreation2 {
    public static void main(String[] args) {
        //Task3: Threadler başlamadan önce Yarış başlasın ve bitince Yarış bitti
//yazdırın.
        System.out.println("yaris basladi");
        Counter c1=new Counter("Roadrunner");
        Counter c2=new Counter("Wolf");
        Thread t1=new Thread(c1);
        Thread t2=new Thread(c2);
        t1.start();
        t2.start();
//        try {    cozum olmaz cunku sureyi bilemeyzi
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("yaris bitti");

    }

}
