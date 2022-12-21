package generiks.Bounding;

import java.util.ArrayList;
import java.util.List;


public class GenericsLowerBoundAndWilCard {
    public static void main(String[] args) {
List<Object> ol=new ArrayList<>();
addElements(ol);
        List<Number> ol1=new ArrayList<>();
        addElements(ol1);
        List<Double> ol2=new ArrayList<>();
//        addElements(ol2);// Bizi run time dan kurtardi compile hata verdi
   //Generic oncesi hata verirdi
        List<String> abc=new ArrayList<>();
        printelements(abc);

        List<Object> sdsa=new ArrayList<>();
        printObject(sdsa);


    }
    //super diyerek integer in parentlarini getir diyoz alttan sinir koyuyoruz yani
    public static void addElements(List<? super Integer> list){
//? wildcards i ifade eder.(Tipi bilinmeyen )
        for (Integer i=1;i<10;i++){
list.add(i);


        }
    }
    //Wildcards in dezavantajlari
    public static void printelements(List<?> list){
//list.add("Java"); ? dan dolayi data türü netlesmeden add gibi islemleri yaptirmaz
        for(Object w:list){
            System.out.print(w+" ");
        }
    }
    public static void printObject(List<Object> list){
        list.add("Java");
        list.add(6);
        for(Object w:list){
            System.out.print(w+" ");

        }
    }
}
