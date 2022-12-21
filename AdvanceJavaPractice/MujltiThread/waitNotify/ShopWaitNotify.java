package AdvanceJavaPractice.MujltiThread.waitNotify;
/*
TASK: Bir marketteki stok miktarını takip eden bir uygulama tasarlayınız.
      Markette yeterli ürün yoksa yeni ürün gelmesi beklensin.
      Yeni ürün eklenince ürün satışı gerçekleşsin.
*/
public class ShopWaitNotify {
    public static volatile int stock=0;

    public static void main(String[] args) {

        ShopWaitNotify shop=new ShopWaitNotify();

        Thread consumerThread=new Thread(new Runnable() {
            @Override
            public void run() {
                shop.consumeProduct(5);
            }
        });
        consumerThread.setName("Tüketici");

        Thread producerThread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                shop.produceProduct(6);
            }
        });
        producerThread.setName("Üretici");

        consumerThread.start();
        producerThread.start();


    }
    public synchronized void consumeProduct(int amount){
        if(amount>stock){
            System.out.println(Thread.currentThread().getName()+" ürün satın almak istiyor.");
            System.out.println("Yeterli ürün yok, Güncel ürün stoğu: "+stock);
            System.out.println("Tüketici ürün girişi yapılmasını bekliyor...");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        if(amount<=stock){
            System.out.println();
            System.out.println(Thread.currentThread().getName()+" ürün satın almak istiyor.");
            System.out.println("Ürün satın alındı, stoktan düşülüyor.");
            stock=stock-amount;
            System.out.println("Güncel stok: "+stock);
        }else{
            System.out.println(Thread.currentThread().getName()+" ürün satın almak istiyor.");
            System.out.println("Yeterli ürün yok, Güncel stok: "+stock);
            System.out.println("Bugün git yarın gel:) ");
        }
    }

    public synchronized void produceProduct(int amount){
        System.out.println();
        System.out.println(Thread.currentThread().getName()+" ürün eklemek istiyor.");
        System.out.println("Yeni ürün/ler eklendi, stok güncelleniyor.");
        stock=stock+amount;
        System.out.println("Güncel stok: "+stock);
        notify();
        System.out.println();
    }


}