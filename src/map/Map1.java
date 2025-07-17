package map;

import java.util.*;
public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();

        m1.put(1,"d");
        m1.put(2,"h");
        m1.put(3,"a");
        m1.put(4,"n");
        m1.put(5,"u");
        System.out.println(m1.get(5));
        System.out.println(m1.values());

        for(Map.Entry<Integer,String> ob : m1.entrySet()) {
            System.out.println(ob);

        }
    }

}
