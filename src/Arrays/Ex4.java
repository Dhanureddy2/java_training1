package Arrays;

public class Ex4 {
    public static void main(String[] args) {
        String [] d ={"Srinu","Padma","Dhanu","janu","Sarojini"};
        char [] ch = d[2].toCharArray();
        System.out.println(ch);
        for (char num : ch)
            System.out.println(num+" ");
    }
}
