package Basics;
import java.util.Scanner;
public class Ternaryopp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        System.out.print("Enter your Gender : ");
        String g = sc.next();

        System.out.println((age>18) && ( g == "Male")? "Eligible to vote": "cannot vote");
    }
}
