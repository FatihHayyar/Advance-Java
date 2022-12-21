package generiks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NonGenerikType {
private Object o;

    public Object getO() {
        return o;
    }

    public void setO(Object o) {
        this.o = o;
    }

    public static void main(String[] args) {
        NonGenerikType obj1=new NonGenerikType();
        NonGenerikType obj2=new NonGenerikType();
        obj1.setO("fatih");
        obj2.setO(36);
String str1= (String) obj1.getO(); //nonGenerikType de cast i zorunlu kiliyor
        String str2= (String) obj2.getO(); //RT except verir Classcast exception
        //cast icin inheritance olmali
        //inheritance olmadan value of yada pars ile cevirebiliriz
        List<String> list1= new ArrayList<String>();
list1.add("fatih");
list1.add("gulus");
//list1.add(4); generics te run time i compile time a cevirdi
        Map<Integer,String> map1= new HashMap<>();
        map1.put(36,"fatih");
//        map1.put("gulus",36); <> generic yapiyi ifade eder

    }
}
