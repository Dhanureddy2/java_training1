package exception;

public class Ex4 {
    public static void main(String[] args) {
        int div = 0;
        try {
            div = 10 / 0;
            System.out.println("welcome");
        } catch (ArithmeticException ex) {
            System.out.println("exception handled");
        }
    }
}

