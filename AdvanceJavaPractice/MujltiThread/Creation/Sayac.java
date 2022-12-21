package AdvanceJavaPractice.MujltiThread.Creation;

public class Sayac extends Thread{
private String name;

    public Sayac(String name) {

        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+" basladi");
        for (int i = 0; i <100;i++) {
            System.out.println(name+" "+i);
        }
        System.out.println(name+" bitti");
    }
}
