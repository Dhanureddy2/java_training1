package map;
import java.util.*;

public class Ex5 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new LinkedHashMap<>();
        m1.put(1,"Dhanu");
        m1.put(2,"Janu");
        m1.put(3,"Reddy");
        m1.put(4,"Srinu");
        m1.put(5,null);
        m1.put(null,null);
        m1.put(null,null);
        System.out.println(m1);
        Map<String ,String > m2 = new TreeMap<>();
        m2.put("1",null);
        m2.put("2",null);
        m2.put("3","10");
        m2.put("4","0");
        Map<Integer,String > m3 = new Hashtable();

        System.out.println(m2);
    }
}
