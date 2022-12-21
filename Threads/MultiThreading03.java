package Threads;

public class MultiThreading03 {
    public static void main(String[] args) {
        Brackets brackets=new Brackets();
Thread threads1=new Thread(new Runnable() {
    @Override
    public void run() {
        for(int i=0; i<7;i++){
brackets.genereteBrackets();
        }
    }
});
threads1.start();
        Thread threads2=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i<7;i++){
                    brackets.genereteBrackets();
                }
            }
        });
        threads2.start();
    }
}
class Brackets{
    public synchronized void genereteBrackets(){
for(int i=0; i<=10;i++) {
if(i<=5){
    System.out.print("[");
}else {System.out.print("]");
}
}
        System.out.println("");
    }

}