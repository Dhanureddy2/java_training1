package Conditions;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Both Numbers are Equal");
        }else{
            System.out.println("Both Numbers are Not Equal");
        }
    }
}
