package lists;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex6 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(null);
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        s1.add(50);
        s1.add(183);
        System.out.println(s1);
        for(Object ob : s1)
        System.out.println(ob);
        System.out.println(s1.contains(50));
        System.out.println(s1.remove(10));
        Iterator<Integer> ite1 = s1.iterator();
        while(ite1.hasNext()) {
            System.out.println(ite1.next());
        }

    }
}
