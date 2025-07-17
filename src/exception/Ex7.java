package exception;

public class Ex7 extends Exception {
    String message;

    public Ex7(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}