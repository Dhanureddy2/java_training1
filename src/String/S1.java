package String;

import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1= "Dhanu";
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        String s2 = "Reddy";
        System.out.println(s1.concat(s2));
        System.out.println(s2.charAt(4));

    }
}
