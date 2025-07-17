package lists;

public class Ex5 {
    public static void main(String[] args) {
        String name ="Dhanu";
        Integer n =2653;
        Integer n1 =22653;
        Boolean flag = false;
        Boolean flag1=true;
        System.out.println(flag.hashCode()%16);
        System.out.println(n1.hashCode()%16);
        System.out.println(n.hashCode()%16);
        System.out.println(name.hashCode()%16);
        System.out.println(flag1.hashCode()%16);
    }
}
