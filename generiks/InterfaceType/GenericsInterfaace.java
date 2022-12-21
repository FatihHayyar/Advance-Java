package generiks.InterfaceType;
//Generic: Data türünden bağımsız yapılar oluşturmamızı sağlar
public interface GenericsInterfaace<T> {
    void setValue(T t);
    T getValue();

}
