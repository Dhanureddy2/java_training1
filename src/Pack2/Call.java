package Pack2;

import Pack1.*;


public class Call {
    public static void main(String[] args) {
        Global g = new Global();
        Global2 g1 = new Global2();
        System.out.println(g.name);
        System.out.println(g1.course);
        System.out.println(Global3.rollno);
        System.out.println(Global4.Cfee);
        System.out.println(Global5.year);
    }
}
