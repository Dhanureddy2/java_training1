package map;

import java.util.*;

public class Hx2 {
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,54546,45,41,251,5152,9,2,2,2,2,2};
        List<Integer> li = new ArrayList<>(Arrays.asList(a));
        for(Object ob : li)
        System.out.println(Collections.frequency(li,ob));
    }
}
