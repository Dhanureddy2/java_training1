package exception;

public class Ex1 {
    public static void main(String[] args) {

        try {
            int a = 10;
            int b = 2;
            int c = a / b;
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        finally {
            System.out.println("Faang");
        }

    }
}