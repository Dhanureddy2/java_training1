package oops;

public class Ex7 implements Ex6{
    public String hello(){
        return "Dhanu";


    }
    public String hello1(){
        return "Reddy";
    }
    public int add(int a, int b){
        return a+b;

    }
    public int sub(int a, int b){
        return a-b;

    }

    public static void main(String[] args) {
        Ex7 obj = new Ex7();
        System.out.println(obj.hello());
        System.out.println(obj.hello1());
        System.out.println(obj.add(10,30));
        System.out.println(obj.sub(20,10));
    }

}
