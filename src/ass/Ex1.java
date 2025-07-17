package ass;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class Ex1 {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>();
        s1.add(10);
        s1.add(20);
        s1.add(30);
        s1.add(40);
        for(int i : s1) {
            System.out.println(i);
            //s1.add(50);
        }
    }
}
