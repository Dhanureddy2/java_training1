package Hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max ) {
                max = arr[i];
            }


        }
            int max2 = Integer.MIN_VALUE;
            for (int j = 0; j< n; j++) {
                if (arr[j] !=max && arr[j] > max2) {
                    max2 = arr[j];
                }
            }
        if(max2==Integer.MIN_VALUE){
            System.out.println("No second largest element");
        }else{
            System.out.println(max2);
        }
    }
}
