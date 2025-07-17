package Hackerrank;
import java.io.*;
import java.util.*;

public class ToBinary{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb  = new StringBuilder();
        if(n==0)
            System.out.println("0");
        while(n>0){
            int b = n%2;
            sb= sb.append(b);
        }
        System.out.println(sb.reverse());

    }
}