package ass;

import java.util.HashSet;
import java.util.Set;
import java.util.*;

public class Ha3 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Arrays.asList(10, 20, 5, 30));
        int max = Integer.MIN_VALUE;
        for (int num : set) {
            if (num > max) max = num;
        }
        System.out.println("Max: " + max);
    }
}
