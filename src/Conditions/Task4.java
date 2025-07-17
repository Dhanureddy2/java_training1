package Conditions;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("The Number is Even");
        }else{
            System.out.println("The Number Is Odd");
        }
    }
}
