package oops;

public class X2 {
    public static int add(int a,int b){
        return a+b;
    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static String add(String s1,String s2){
        return s1+s2;
    }

    public static void main(String[] args) {
        X2  ob = new X2();
        System.out.println(ob.add(10,20));
        System.out.println(ob.add(10,20,30));
        System.out.println(ob.add("Dhanu","Janu"));
    }
}
