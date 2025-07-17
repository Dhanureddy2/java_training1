package Enum;

public enum Months {
    JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC;

    public static void main(String[] args) {
        Months[] a = Months.values();
        for(Months ob:a)
            System.out.println(ob);
    }
}
