package Conditions;

import java.util.Scanner;

//14. Write a Program display pass or fail to user based on marks?

public class Work14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your marks:");
        int a = sc.nextInt();
        if(a<24){
            System.out.println("fail");
        }else{
            System.out.println("pass");
        }
    }
}
