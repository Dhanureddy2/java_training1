package Methods;

import java.util.Scanner;

public class Ex1 {
    public int add(int a, int b){
        return a+b;

    }
    public int sub(int a , int b){
        return a-b;
    }
    public int mul(int a ,int b){
        return a*b;

    }
    public int div(int a , int b){
        return a/b;
    }
    public int mod(int a,int b){
        return a%b;
    }
    public  static String sconc(String s1,String s2){
        return s1+s2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Ex1 ob = new Ex1();
        System.out.println(ob.add(a,b));
        System.out.println(ob.sub(a,b));
        System.out.println(ob.mul(a,b));
        System.out.println(ob.div(a,b));
        System.out.println(ob.mod(a,b));
        System.out.println(Ex1.sconc("Dhanu","Reddy"));
    }
}
