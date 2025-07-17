package Conditions;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        if(a>0){
            System.out.println("Positive number");
            if(a==0){
                System.out.println("Neutral Number");
            }
        }else{
            System.out.println("Negative Number");
        }
    }
}
