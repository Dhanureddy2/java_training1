package Hackerrank;

import java.util.Scanner;

public class Pymaridofoddnumbers {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int num = 1;

            for (int i = 1; i <= n; i++) {

                for (int s = 1; s <= n - i; s++) {
                    System.out.print(" ");
                }


                for (int j = 1; j <= i; j++) {
                    System.out.print(num);
                    if (j != i) System.out.print(" ");
                    num += 2;
                }

                System.out.println();
            }
        }
    }

