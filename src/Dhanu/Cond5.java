package Dhanu;

import java.util.Scanner;

public class Cond5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        //int b = sc.nextInt();
        if((a%3==0)&& (a%5!=0)){
            System.out.println("FIZZ");
        }else {
            System.out.println("BUZZ");
        }
    }
}
