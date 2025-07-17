package map;

import java.util.*;

public class Hx1 {
    public static int freq(int i ,List<Integer> l1){
        int co =0;
        for(int ele : l1){
            if(i==ele){
                co++;
            }
        }
        return co;
    }
    public static void main(String[] args) {
        Integer [] a = {1,2,3,4,54546,45,41,251,5152,9,2,2,2,2,2};
        List <Integer> li = new ArrayList<>(Arrays.asList(a));

        Map<Integer,Integer> m1 = new LinkedHashMap<>();
        m1.put(1,freq(2,li));
        System.out.println(m1);

        System.out.println(Collections.frequency(li,2));

    }
}
