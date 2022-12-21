package AdvanceJavaPractice.MujltiThread.volatileKeyword;

public class Numerator {
    private volatile static int sayac=0;
    //volatile keywordü değişkenin main memoryde saklanmasını garanti eder ancak
    //tüm threadlerin değişkene aynı anda ulaşmasından kaynaklı çakışmaya çözme garantisi yoktur.
    //bunun için synchronized keywordü de kullanılmalı
    public void getOrder(){
sayac=sayac+1;
String name=Thread.currentThread().getName();
        System.out.println("Sayin "+name+" siraniz "+sayac);

    }
}
