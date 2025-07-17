package Hackerrank;

import java.util.Scanner;

public class Square_Root_Calculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sq = 0;
        for(int i=1;i*i<=a;i++){
            sq=i;

        }
        System.out.println(sq);
    }
}
