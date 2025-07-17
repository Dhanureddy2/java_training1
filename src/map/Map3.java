package map;

import java.util.Map;
import java.util.TreeMap;

public class Map3 {
    public static void main(String[] args) {
        Map<Integer,Integer> m3 = new TreeMap<>();
        m3.put(1,20);
        m3.put(2,30);
        m3.put(3,40);
        m3.put(4,5);
        m3.put(5,0);
        System.out.println(m3);
        for(Map.Entry<Integer,Integer> ob : m3.entrySet()) {
            System.out.println(ob);

        }

    }
}
