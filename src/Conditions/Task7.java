package Conditions;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        if(a>b){
            System.out.println("A is Bigger");
        }else {
            System.out.println("B is Bigger");
        }
    }
}
