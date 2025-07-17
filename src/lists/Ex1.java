package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(10,20,30,40,null));
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
            System.out.println(l1);
        //for(Object temp : l1)
            //System.out.println(temp);
        Iterator<Integer> iterator  = l1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
l1.add(2653);
        }

        }
    }

