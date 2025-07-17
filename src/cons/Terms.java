package cons;



public class Terms {
    private int a;
    private String  b ;
    private int c;
    private String d;
    private String com;

    public Terms(int a, String b, int c,String d,String com) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.com=com;
    }

    public static void main(String[] args) {
       Terms ob = new Terms(10,"Dhanu",50,"Reddy","REDDYMOTORS");
        System.out.println(ob.a);
        System.out.println(ob.b);
        System.out.println(ob.c);
        System.out.println(ob.d);
        System.out.println(ob.com);


    }
}
