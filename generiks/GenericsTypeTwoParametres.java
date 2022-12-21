package generiks;

public class GenericsTypeTwoParametres<S,U> {
    private S s;
    private U u;

    public GenericsTypeTwoParametres(S s, U u) {
        this.s = s;
        this.u = u;
    }

    public GenericsTypeTwoParametres() {
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

    public static void main(String[] args) {
        GenericsTypeTwoParametres<String,Integer> obj1=new GenericsTypeTwoParametres<>("Java",1);
        GenericsTypeTwoParametres<Integer,String> obj2=new GenericsTypeTwoParametres<>(1,"Spring Boot");
        System.out.println(obj1.getS());
        System.out.println(obj2.getU());
    }

}
