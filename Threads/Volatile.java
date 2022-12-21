package Threads;

public class Volatile {
    volatile public static int a=0;
    public static void main(String[] args) {
        Thread thread1=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    if(a==0){
                        System.out.println("threa1 calisiyor");
                    }else {
                        break;
                    }
                }
            }
        });
thread1.start();
Thread thread2=new Thread(new Runnable() {
    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a=1;
        System.out.println("Flag degisti");
    }
});
thread2.start();
    }
}
