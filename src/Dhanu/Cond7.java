package Dhanu;

import java.util.Scanner;

public class Cond7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("a is Positive");
            if(a==0){
                System.out.println("a is Neutal");
            }
        }else{
            System.out.println("a is Negative");
        }
    }
}
