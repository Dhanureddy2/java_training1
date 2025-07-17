package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] ch = b.toCharArray();
        char[] ar = a.toCharArray();
        Arrays.sort(ar);
        Arrays.sort(ch);
        if(Arrays.equals(ch,ar))
            System.out.println(true);
        else
            System.out.println(false);

    }
}
