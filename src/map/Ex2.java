package map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Ex2 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(0,"Dhanu");
        m1.put(1,"Janu");
        m1.put(2,"hi");
        m1.put(3,"Hello");

        System.out.println(m1.get(5));
        System.out.println(m1.values());
        System.out.println(m1.containsKey(0));
        System.out.println(m1.containsValue("Hello"));

    }
}
