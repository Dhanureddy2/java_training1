package lists;

import java.util.*;

public class ConvertAS {
    public static void main(String[] args) {
        int sum =0;
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1,1,10,0,0,20,null,20,26,53,26,53,78,50,60,null));

        System.out.println(l1);
        for(int i =0;i<l1.size();i++){
           // sum +=l1.get(i);
        }

        Set<Integer> s1 = new HashSet<>(l1);
        System.out.println(s1);
       int [] a1 = {10,20,30,40};


    }
}
