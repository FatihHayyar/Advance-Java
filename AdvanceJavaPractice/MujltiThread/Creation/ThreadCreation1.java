package AdvanceJavaPractice.MujltiThread.Creation;
/*

1) Multithreading Programlama nedir?
    Aynı processde iki veya daha fazla iş parçacığının(thread) aynı anda çalışma süreci

2) Threadler 2 şekilde oluşturulur:

        --Thread sınıfından extend eden alt sınıf oluşturup, onun run metodu override edilir.

         --Runnable interfaceini implement eden bir alt sınıf oluşturup run metodu override edilir,
         ardından Thread sınıfının constructorına nesne olarak gönderilir.

3) Run metodunu doğrudan Main metodundan çağırabilir miyiz?

   Evet, ancak thread oluşturulmaz.

4) Javada herhangi bir thread oluşturmazsak uygulamalar nerde/nasıl çalışır?

   Java varsayılan olarak tüm uygulamalarda main threadini  kullanılır.


*/
//Task1: Thread sınıfını extend eden Sayac isminde sınıf oluşturup
// bu sınıftan sayıları 1 den 100 e kadar yazdıran iki tane thread oluşturunuz.

public class ThreadCreation1 {
    public static void main(String[] args) {
        Sayac sayac1=new Sayac("ronaldo");
        Sayac sayac2=new Sayac("Messi");
        sayac1.start();
        sayac2.start();


    }


}
