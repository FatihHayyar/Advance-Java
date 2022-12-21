package generiks;

public class GenericsType<T> {
    // E elemet demekktir Collection gibi yapilarda kullanilir
    // K key
    // V value
    // N number
    // T type
    //S,U,V, vb  2. 3. 4. tipler icin
private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }

    public static void main(String[] args) {
        // generiks yapi ile 2 farkli variable olustur
        GenericsType<String> str=new GenericsType<>();
//Generikte diamond icine non primitive type girilebilir
        str.setType("Fatih");
        String adim= str.getType();
        System.out.println(adim);
        GenericsType<Integer> sayi=new GenericsType<>();
        sayi.setType(36);
        int yas= sayi.getType();
        System.out.println(yas);

    }
}
