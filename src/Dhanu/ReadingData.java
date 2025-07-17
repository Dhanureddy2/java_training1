package Dhanu;
import java.util.Scanner;
public class ReadingData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value for a :");
        int a = sc.nextInt();
        System.out.println("Enter the Value for b :");
        byte b = sc.nextByte();
        System.out.println("Enter the value for c :");
        float c = sc.nextFloat();
        System.out.println("Enter the Value for d : ");
        double d = sc.nextDouble();
        System.out.println("Enter the Value for l :");
        long l = sc.nextLong();
        System.out.println("Enter your name :");
        String n = sc.next();


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(l);
        System.out.println(n);


    }
}
