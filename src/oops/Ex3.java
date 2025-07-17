package oops;

import java.util.Scanner;


abstract class Operation {
    int a, b;
    Operation(int a, int b) {
        this.a = a;
        this.b = b;
    }
    abstract int compute();
}


class Add extends Operation {
    Add(int a, int b) {
        super(a, b);
    }
    int compute() {
        return a + b;
    }
}


class Mul extends Operation {
    Mul(int a, int b) {
        super(a, b);
    }
    int compute() {
        return a * b;
    }
}

public class Ex3  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        Operation add = new Add(a, b);
        Operation mul = new Mul(a, b);

        System.out.println("Sum = " + add.compute());
        System.out.println("Product = " + mul.compute());
    }
}