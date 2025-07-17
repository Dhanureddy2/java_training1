package ass;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Ex3 {
    public static void main(String[] args) {
        Set<Integer> s3 = new LinkedHashSet<>(Arrays.asList(0,2,3,1,26,5,6,5,7,5,9,null));
        Iterator<Integer> it = s3.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
           // s3.add(10);
        }


    }
}
