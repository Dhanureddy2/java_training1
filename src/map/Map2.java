package map;
import java.util.*;


public class Map2 {
    public static void main(String[] args) {
        Map<Integer,String > m2 = new Hashtable<>();
        m2.put(1,"d");

        m2.put(2,"h");
        m2.put(3,"a");
        m2.put(4,"n");
        m2.put(5,"u");
        System.out.println(m2);
        for(Map.Entry<Integer,String> ob : m2.entrySet()) {
            System.out.println(ob);

        }
    }
}
