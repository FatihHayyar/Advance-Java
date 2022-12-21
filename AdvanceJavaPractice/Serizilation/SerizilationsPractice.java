package AdvanceJavaPractice.Serizilation;

import java.io.*;

public class SerizilationsPractice {
    public static void main(String[] args) {
        //book tipinde nesnelere uretip bu nesneleri book isimli bir txt dosyasina kaydedlim
        //dahasonra bu dosyadan nesneleri geri okuyalim
//writeObject();
readObject();



    }
    public static void writeObject(){
Book book1=new Book("Cin Ali","omer seyfo",1965);
Book book2=new Book("suc ve ceza","dostoyevski",1945);
Book book3=new Book("Sefiller","viktor hugo",1925);

        try {
            FileOutputStream fos=new FileOutputStream("books.text");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(book1);
            oos.writeObject(book2);
            oos.writeObject(book3);
            fos.close();
            oos.close();

        } catch (IOException e) {
           e.printStackTrace();
        }
    }
public static void readObject(){

    try {
        FileInputStream fis= new FileInputStream("books.text");
        ObjectInputStream ois=new ObjectInputStream(fis);
       Book book1= (Book) ois.readObject();
       Book book2= (Book) ois.readObject();
       Book book3= (Book) ois.readObject();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        fis.close();
        ois.close();

    } catch (IOException | ClassNotFoundException e) {
        throw new RuntimeException(e);
    }


}


}
