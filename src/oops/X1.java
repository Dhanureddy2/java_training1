package oops;

import java.util.Scanner;

public class X1 {
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a , int b ,int c){
        return a*b*c;

    }
    public static String name(String s){
        return s;
    }

    public static void main(String[] args) {
        X1 ob = new X1();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        System.out.println(ob.sub(a,b));
        System.out.println(ob.mul(a,b,1));
        System.out.println(ob.name(s));
    }
}
