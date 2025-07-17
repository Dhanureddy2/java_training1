package Hackerrank;

import java.util.Scanner;

public class perfectsquarecheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
            System.out.println("False");
        else{
            int sqrt=(int)Math.sqrt(n);
            if(sqrt*sqrt ==n){
                System.out.println("true");
            }else{
                System.out.println("False");
            }
        }
    }
}
