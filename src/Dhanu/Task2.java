package Dhanu;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value : ");
        int a = sc.nextInt();
        System.out.println("enter b value :");
        int b = sc.nextInt();
        System.out.println("enter c value :");
        int c = sc.nextInt();
        System.out.println((a>b)&&(a>c)?a:(b>c)?b:c);




    }
}
