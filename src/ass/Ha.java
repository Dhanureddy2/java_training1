package ass;

import java.util.HashSet;

public class Ha {
    public static void main(String[] args) {
        HashSet<String> h1 = new HashSet<>();
        h1.add("Dhanu");
        h1.add("Janu");
        h1.add("Paddu");
        h1.add("Reddy");
        h1.add("Srinu");
        for(Object ob : h1)
            System.out.println(ob);
    }
}
