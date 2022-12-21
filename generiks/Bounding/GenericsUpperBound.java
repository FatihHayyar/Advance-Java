package generiks.Bounding;
//ustten sinirladim. number ile
public class GenericsUpperBound <T extends Number>{
private T[] number;

    public GenericsUpperBound(T[] number) {
        this.number = number;
    }

    //Arrayin icindeki degerlerin ortalamasini bulan kodu yazin
    public double getAvarage(){
        double sum=0;
        for(T t:number){
            sum+=t.doubleValue();
        }
        return sum/number.length;
    }

    public static void main(String[] args) {
        Integer[] numbers ={4,9,16,7};
        GenericsUpperBound<Integer> obj1=new GenericsUpperBound<>(numbers);
        System.out.println(obj1.getAvarage());
        Double[] numbers2 ={4.5,9.6,16.2,7.5};
        GenericsUpperBound<Double> obj2=new GenericsUpperBound<>(numbers2);
        System.out.println(obj2.getAvarage());
        String[] numbers3 ={"4","9","16","7"};
//        GenericsUpperBound<String> obj3=new GenericsUpperBound<>(numbers3); Calismaz cunku yukarda number diye sinirladik

    }
}
