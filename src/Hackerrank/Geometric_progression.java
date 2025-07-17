package Hackerrank;

import java.util.Scanner;

public class Geometric_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();
        int sum =0,term =a;
        for(int i=1;i<=n;i++){
            sum += term;
            term *= r;
        }
        System.out.println(sum);
    }

}
