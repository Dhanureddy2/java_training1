package lists;
import java.util.ArrayList;
import java.util.List;

public class CaL {
    public static void main(String[] args) {
        List<UserDetails> l1 = new ArrayList<>();
        UserDetails ob = new UserDetails("Dhanunjay","Reddy","Guntur");
        UserDetails ob2 = new UserDetails("Anju","Reddy","Hyd");
        l1.add(ob);
        l1.add(ob2);
        for(UserDetails ob1 : l1) {
            System.out.println(ob1.getFname());
            System.out.println(ob1.getLname());
            System.out.println(ob1.getLoc());
        }

    }
}
