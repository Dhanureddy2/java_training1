package lists;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> l2 =new LinkedList<>();
        l2.add(10);
        l2.add(20);
        l2.add(30);
        l2.add(40);
        l2.add(null);
        System.out.println(l2);
        //for(Object temp : l2)
           // System.out.println(temp);
        Iterator<Integer> ite = l2.iterator();
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
