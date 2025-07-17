package oops;

public class EnRead extends Encap {
    public static void main(String[] args) {
        EnRead ob = new EnRead();
        ob.setAge(20);
        ob.setDept("CSE");
        ob.setName("Dhanu");
        System.out.println(ob.getAge());
        System.out.println(ob.getDept());
        System.out.println(ob.getName());
    }
}
