package lists;

import java.util.ArrayList;
import java.util.List;

public class Cal2 {
    public static void main(String[] args) {
        List<LapDetails> l1 = new ArrayList<>();
        LapDetails ob = new LapDetails("Lenovo","LOQ",75000);
        LapDetails ob2 = new LapDetails("ASUS","ROG",1200000);
        l1.add(ob);
        l1.add(ob2);
        for(LapDetails ob1 : l1) {
            System.out.println(ob1.getBrand());
            System.out.println(ob1.getModel());
            System.out.println(ob1.getPrice());
        }
    }
}
