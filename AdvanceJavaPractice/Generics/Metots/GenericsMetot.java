package AdvanceJavaPractice.Generics.Metots;

import java.util.Arrays;

public class GenericsMetot {
    public static void main(String[] args) {

        String[] stdList={"Rafael","Donatello","Leonardo","Michelangelo"};
        Double[] pointList={95.5,70.0,65.6,58.0};
        Character[] gradeList={'A','B','C','B'};

        //1-tüm listeleri yazdır
printArray(stdList);
printArray(pointList);
printArray(gradeList);

        //2-öğrencileri isimlerine göre sıralayınız
        System.out.println(Arrays.toString(order(stdList)));


        //3-öğrenci notlarını sıralayınız
        System.out.println(Arrays.toString(order(pointList)));

        //4-öğrenci harf notlarını sıralayınız
        System.out.println(Arrays.toString(order(gradeList)));

    }
    //-diziyi yazdıran bir method yazınız.



    //-diziyi artan sıralayan bir method yazınız.

public static <T> void printArray(T[] arr){
for (T t:arr){
    System.out.print(t+" ");
}
    System.out.println();
}
public static <T extends Comparable > T[] order(T[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
if(arr[i].compareTo(arr[j])>0){
T temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
            }
        }
        return arr;
}

}
