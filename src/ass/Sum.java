package ass;

import java.util.ArrayList;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int sum =0;
        List<Integer> l1 = new ArrayList<>();
        l1.add(10); l1.add(20);l1.add(30);
        l1.add(40);
        l1.add(50);
       for(int num : l1){
         sum += num;
       }
        System.out.println(sum);
    }
}
