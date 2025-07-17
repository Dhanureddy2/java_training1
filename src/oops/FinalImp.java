package oops;


public class FinalImp implements FinalInterface{
    @Override
    public int add() {
        return 10;
    }

    @Override
    public int sub() {
        return 20;
    }

    @Override
    public int mul() {
        return 30;
    }

    @Override
    public int div() {
        return 40;
    }

    public static void main(String[] args) {
        FinalImp ob = new FinalImp();
        System.out.println(ob.add());
        System.out.println(ob.div());
        System.out.println(ob.mul());
        System.out.println(ob.sub());
    }
}
