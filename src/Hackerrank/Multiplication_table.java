package Hackerrank;

import java.util.Scanner;

public class Multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int a;
        for(int i =1;i<=10;i++)
        {
            a=n*i;
            System.out.println(n+" x "+ i +" = "+a);
        }
    }
}
