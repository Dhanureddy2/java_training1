import oops.*;

import java.util.Scanner;

public class Ex5 extends Ex4 {

    @Override
    public int add() {
        return 120;
    }

    @Override
    public int sub() {
        return 18500;
    }

    public String dhanu() {
        return "This is a Simulation Game played in a Virtual World";
    }
public int divide (int a ,int b){
        return a/b;
}
    public static void main(String[] args) {
        Ex5 obj = new Ex5();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.dhanu());
        System.out.println(obj.sub());
        System.out.println(obj.add());
        System.out.println(obj.divide(a,b));
    }
}