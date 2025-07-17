package Dhanu;

import java.util.Scanner;

public class Cond6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a YEAR :");
        int a = sc.nextInt();
        if((a%100==0)&&(a % 4==0) || (a%100!=0)&&(a%4==0)){
            System.out.println("Is a Leap Year");
        }else{
            System.out.println("not a Leap Year");
        }

    }
}
