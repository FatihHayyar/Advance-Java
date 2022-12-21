package AdvanceJavaPractice.Generics.Classes;

public class Student<S,U,V> {
//    Task: 1) Java dersi için, öğrencileri isim, vize notu ve final notunu  ile birlikte listeleyen bir program yazınız.
//      2) Kütüphane için, öğrencileri isim, okul no ve mail adresi ile birlikte listeleyen bir program yazınız.
private S s;
private U u;
private V v;

    public Student(S s, U u, V v) {
        this.s = s;
        this.u = u;
        this.v = v;
    }

    public Student() {
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }
    public static void makeList(){
        Student<String,Double,Double> std1=new Student<>("Wilma",77.2,80.6);
        Student<String,Double,Double> std2=new Student<>("Fred",89.0,90.6);
        Student<String,Double,Double> std3=new Student<>("Barnie",56.2,76.6);

        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std3.getS(),std3.getU(),std3.getV());
    }
    public static void makeListLibrary(){
Student<String,Integer,String> std1=new Student<>("Cakil",567,"cakil.com");
Student<String,Integer,String> std2=new Student<>("Bamba",568,"bamba.com");
Student<String,Integer,String> std3=new Student<>("nuri",569,"nuri.com");

        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std1.getS(),std1.getU(),std1.getV());
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std2.getS(),std2.getU(),std2.getV());
        System.out.printf("%-10s  ||  %4s  ||  %4s  %n",std3.getS(),std3.getU(),std3.getV());
    }



    public static void main(String[] args) {
        System.out.println("Java icin Vize ve Final Notlari");
        makeList();
        System.out.println("Kutüphane Listesi");
        makeListLibrary();
    }
}
