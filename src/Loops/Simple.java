package Loops;

public class Simple {
        public static void main(String[] args) {
            int a = 196;
            int b = 233;
            int sum1 = 0;
            int sum2 = 0;
            for (int i = a; i > 0; i /= 10) {
                sum1 += i % 10;
            }
            for (int i = b; i > 0; i /= 10) {
                sum2 += i % 10;
            }
            int add = sum1 + sum2;
            System.out.println("Sum of digits of " + a + " = " + sum1);
            System.out.println("Sum of digits of " + b + " = " + sum2);
            System.out.println("Final result =" + add);

        }
    }

