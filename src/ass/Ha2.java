package ass;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ha2 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(10,20,30,10,30,40,50));
        Set<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s1);
        System.out.println(intersection);

    }
}
