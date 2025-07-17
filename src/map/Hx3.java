package map;

import java.util.Map;
import java.util.TreeMap;

public class Hx3 {
    public static void main(String[] args) {
        String s1 = "hello";
        Map<Character, Integer> m1 = new TreeMap<>();
        for (char ch : s1.toCharArray()) {
            m1.put(ch, m1.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : m1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}