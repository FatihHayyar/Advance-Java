package Threads;

public class MultiThreading4 {
    public static void main(String[] args) {
Brackers2 brackers2=new Brackers2();
long start=System.currentTimeMillis();
Thread thread1=new Thread(new Runnable() {
    @Override
    public void run() {
       for (int i=1; i<7;i++) {
           brackers2.generateBrackers();
       }
    }
});
thread1.start();
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=1; i<7;i++) {
                    brackers2.generateBrackers();
                }
            }
        });
thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(System.currentTimeMillis()-start);
    }
}
class Brackers2{
    public  void generateBrackers(){
        synchronized (this){
            for(int i=0; i<=10;i++){
            if(i<=5){
                System.out.print("[");
            }else {System.out.print("]");
            }
        }
        System.out.println();}
        for(int i=1; i<=5; i++){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        }
    }
