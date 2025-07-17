package exception;

public class Ex8 {
    public static void main(String[] args) {
        Ex8 v = new Ex8();
        try {
            v.getVoteValidation(2);
        } catch (Ex7 e) {
            System.out.println(e.getMessage());
        }
    }

    public void getVoteValidation(int age) throws Ex7 {
        if (age >= 18) {
            System.out.println("You are eligible for voting");
        } else {
            throw new Ex7("You are not eligible for voting");
        }
    }
}