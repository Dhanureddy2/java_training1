package ass;

import java.util.*;

public class St {
    public static void main(String[] args) {
        List<String> l2 = new ArrayList<>(Arrays.asList("Dhanu","Janu","Srinu","alex"));
        System.out.println(l2);
        Collections.sort(l2);
        System.out.println(l2);
        Collections.reverse(l2);
        System.out.println(l2);
    }
}
