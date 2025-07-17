package Enum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public enum Tsac {
 WRONGPIN,
 INSUFFICIENTFUNDS,
 NETWORKERROR,
 SERVERERROR,
 DAILYLIMITEXCEED,
 CARDINVALID,
 ILLEGLTRANSACTIONS;

    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        for(Tsac ob :Tsac.values())
            m1.put(ob.ordinal(),ob.name());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the error code:");
        int key = sc.nextInt();
        if(m1.containsKey(key))
            System.out.println(m1.get(key));
        else
            System.out.println("Invalid error code");
    }
}


