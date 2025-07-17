package Methods;

public class Add {
    static  int add(){

        int a = 500;
        int b = 600;
        int c =800;
        return a+b;
    }

    public int add(int a ,int b){
        return a+b;
    }
    public int add(int a, int b,int c){
        return a+b+c;
    }
    public  String display(){
        return "100";
    }
    public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(Add.add());
        System.out.println(obj.add(1,4,5));
        System.out.println(obj.display());

    }
}
