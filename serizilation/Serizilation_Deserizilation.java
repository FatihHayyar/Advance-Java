package serizilation;

import java.io.*;

public class Serizilation_Deserizilation {
    public static void main(String[] args) {
//writeObjects();
readObject();

    }
private static void writeObjects(){
    System.out.println("user objeleri olusturuluyor");
    User user1=new User(1234,"fatih","1234");
    User user2=new User(1235,"Osman","1235");
    User user3=new User(1236,"furkan","1236");

    try {
        FileOutputStream fod=new FileOutputStream("user.dat");
        ObjectOutputStream oos=new ObjectOutputStream(fod);
        oos.writeObject(user1);
        oos.writeObject(user2);
        oos.writeObject(user3);
    } catch (IOException e) {
        e.printStackTrace();
    }
}
public static void readObject(){
    try {
        FileInputStream fis=new FileInputStream("user.dat");
        ObjectInputStream ois=new ObjectInputStream(fis);
       User user1= (User) ois.readObject();
       User user2= (User) ois.readObject();
       User user3= (User) ois.readObject();

        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);
    } catch (FileNotFoundException e) {
       e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }


}

}
//user  class ini transfer edbilmek icin isaretledik
class User implements Serializable{
private long id;
private String username;
private String password;

    public User(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}