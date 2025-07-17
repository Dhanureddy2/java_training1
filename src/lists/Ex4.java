package lists;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Ex4 {
    public static void main(String[] args) {
        List<Integer> l4 = new CopyOnWriteArrayList<>(Arrays.asList(102,78,789,989,456,10,null));
        l4.add(78);
        l4.add(989);
        l4.add(65);
        l4.add(null);
       // for(Object te : l4)
          //  System.out.println(te);
        Iterator<Integer> iterator  = l4.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
                    l4.add(2653);

        }
        System.out.println(l4);

    }
}
