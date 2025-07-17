package Hackerrank;

import java.util.Scanner;

public class Automorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int ch = 0;


        while (temp != 0) {
            ch++;
            temp /= 10;
        }

        int sq = n * n;
        int mod= (int) Math.pow(10, ch);

        if (sq % mod == n)
            System.out.println("true");
        else
            System.out.println("false");
    }
}

