package ass;

import java.util.*;

public class Ex4 {
    public static void main(String[] args) {
        Set<Integer> s4 = new TreeSet<>(Arrays.asList(20,30,94,5631,4613,1,2,3,4,10,6461));
        Iterator<Integer> it = s4.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
           // s4.add(5);
        }
        Collections.min(s4);

    }
}
