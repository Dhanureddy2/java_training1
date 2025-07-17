package String;

public class S3 {
    public static void main(String[] args) {
        String s1 = "Dhanu";
        StringBuilder s2 = new StringBuilder(s1);
        s2.append(" Reddy");
        System.out.println(s2);
        s2.reverse();
        System.out.println(s2.charAt(3));
        System.out.println(s2);
        s2.toString();
        System.out.println(s2.getClass());
    }
}
