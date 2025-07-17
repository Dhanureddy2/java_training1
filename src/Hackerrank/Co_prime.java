package Hackerrank;

import java.util.Scanner;

public class Co_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x= a;
        int y=b;
        while(y!=0){
            int temp = y;
            y=x%y;
            x=temp;
        }
        if(x==1)
            System.out.println(true);
        else
            System.out.println(false);
    }
}
