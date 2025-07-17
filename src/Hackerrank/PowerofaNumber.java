package Hackerrank;
import java.util.Scanner;
public class PowerofaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int n= sc.nextInt();
        int prod= 1 ;
        for(int i =1;i<=n;i++){
            prod = prod*a;
        }
        System.out.println(prod);
    }
}
