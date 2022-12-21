package generiks.Methots;
// Generiks metotlar hangi durumda bize kolaylik saglar
public class GenericsMetotDemo {
    public static void main(String[] args) {
        GenericsMetotDemo obj1= new GenericsMetotDemo();
        Integer[] intArray= {1, 23, 54, 56, 45};
        Double[] doubleArray= {1.2, 2.4, 5.6, 9.3};

        obj1.print(intArray);
        obj1.print(doubleArray);

    }

//    public void print(Integer[] arr){
//
//
//    }
//    public void print(Double[] arr1){
//
//
//    }

    public <T> void print(T[] array){

        for(T t:array){
            System.out.println(t);
        }
    }
}
