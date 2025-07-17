package Dhanu;

import java.util.Scanner;

public class IfCondition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age =sc.nextInt();
        if(age>18) {
            System.out.println("Your are Eligible to vote");
        }
    }
}
