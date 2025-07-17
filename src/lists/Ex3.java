package lists;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> l3 = new Vector<>();
        l3.add(40);
        l3.add(50);
        l3.add(60);
        l3.add(70);
        System.out.println(l3);

        Iterator<Integer> ite  = l3.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
