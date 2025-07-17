package oops;

import java.util.Scanner;

public class X3 extends X2{
    public static int Sqarea(int a ){
        return a*a;
    }
    public static int Rearea(int a,int b){
        return 2*(a+b);
    }
    public static double CicArea(double p){
        return 3.14*(p*p);
    }
    public static void main(String[] args) {
        X3 ob = new X3();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int  b = sc.nextInt();
        double p = sc.nextDouble();
        System.out.println(ob.Sqarea(a));
        System.out.println(ob.Rearea(a,b));
        System.out.println(ob.CicArea(p));
    }
}

