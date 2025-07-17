package Dhanu;

import java.util.Scanner;

public class Cond3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("You Can Vote");
        }else{
            System.out.println("Please wait until you turn 18 years old buddy");
        }
    }
}
