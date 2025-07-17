package map;

import java.util.HashMap;
import java.util.Map;

public class Ex3 {
    public static void main(String[] args) {
        Map<String,String> m2 = new HashMap<>();
        m2.put("1","janu");
        System.out.println(m2);
        Map<Integer,Integer> m3 = new HashMap<>();
        m3.put(1,123);
        System.out.println(m3);
    }
}
