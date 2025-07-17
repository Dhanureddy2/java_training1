package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex1 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(1,"Dhanu");
        m1.put(2,"Janu");
        m1.put(3,"Reddy");
        m1.put(4,"Srinu");
        System.out.println(m1.get(0));
        System.out.println(m1.get(-1));
        System.out.println(m1.get(1));




    }
}
