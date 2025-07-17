package Hackerrank;

import java.util.Scanner;

public class Arithmetic_sequence_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int sum = 0,term=a;
        for(int i =1;i<=n;i++){
            sum += term;
            term +=d;

        }
        System.out.println(sum);
    }
}
