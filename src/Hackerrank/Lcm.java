package Hackerrank;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =a;
        int d=b;
        while(d!=0){
            int temp =d;
            d=c%d;
            c=temp;

        }
        int gcd = c;
        int lcm =(a/gcd)*b;
        System.out.println(lcm);

    }

}
