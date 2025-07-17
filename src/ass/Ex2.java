package ass;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class Ex2 {
    public static void main(String[] args) {
        Set<Integer> s2 = new CopyOnWriteArraySet<>(Arrays.asList(10,20,3,4,0,7,8,9));
        for(int i : s2) {
            System.out.println(i);
            s2.add(40);
        }
        System.out.println(s2);
    }
}
