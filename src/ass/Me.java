package ass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Me {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(4,5));
        l2.addAll(l1);
        for(int i : l2)
            System.out.println(i);
    }
}
