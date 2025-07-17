package ass;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Ex5 {
    public static void main(String[] args) {
        Integer [] a = {10,20,30,1,40,50,2,6,7,8};
        Set<Integer> s1 = new HashSet<>(Arrays.asList(a));

        System.out.println(Collections.min(s1));
        System.out.println(Collections.max(s1));

    }
}
