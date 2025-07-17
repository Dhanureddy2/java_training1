package lists;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EX7 {
    public static void main(String[] args) {
        Set<Integer>  s1 =  new LinkedHashSet<>(Arrays.asList(10,1,2,3,4,2,5,6,7,8,9,10,1,11));
        System.out.println(s1);

        Set<Integer> s2 = new TreeSet<>(Arrays.asList(10,20,3,0,8,9,7,5,6,81,108,40,4,7,8,97));
        System.out.println(s2);
      Object[] s3 = s2.toArray();
      for(Object c : s3)
        System.out.println(c);
    }
}
