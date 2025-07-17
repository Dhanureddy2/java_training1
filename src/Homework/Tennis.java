package Homework;

import java.util.Scanner;
public class Tennis {
    public static String price;
    public static String Ddate;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Shop");
        System.out.print("Please enter your Name :");
        String name = sc.nextLine();
        System.out.print("Enter your Age :");
        int age = sc.nextInt();
        System.out.println("Rackets Avalible");
        System.out.println(" " + "1.$3000: Technifibre / Babolat \n 2.$5000: Head/  Yonex\n 3.$8000: Vector\n");
        System.out.print("Please Select the Brand that you wish to Buy : ");
        String  ch=sc.next();

            if (ch.equals("1") || ch.equals("Babolat") || ch.equals("babolat")) {
                System.out.println("You Selected $3000 : Technifibre / Babolat Racket ");
                System.out.print("please confirm the price y or 0 = yes & 1 or n = no : ");
                price = sc.next();
                if (price.equals("0") || price.equals("y")) {
                    System.out.println("the price is $3000");
                    System.out.println("Thank you for choosing the brand");
                    System.out.println("Please Enter  the Delivery Date the Delivery date should be in the format and after  09/06/2025 or dd/MM/yyyy");
                    Ddate = sc.next();
                    if(Ddate .equals("09/06/2025")){
                        System.out.println("please Enter a Valid Delivery Date ");
                    }else{
                        System.out.println("The Delivery Date is "+" "+Ddate);
                        System.out.println("Thank you For Purchasing with us");
                    }
                }
            } else if (ch.equals("2") || ch.equals("Yonex") || ch.equals("yonex")) {
                System.out.println("You Selected $5000: Head/ Yonex Racket");
                System.out.print("please confirm the price y or 0 = yes & 1 or n = no : ");
                price = sc.next();
                if (price.equals("0") || price.equals("y")) {
                    System.out.println("the price is $5000");
                }System.out.println("Thank you for choosing the brand");
                System.out.println("Please Enter  the Delivery Date the Delivery date should be in the format and after  09/06/2025 or dd/MM/yyyy");
                Ddate = sc.next();
                if(Ddate .equals("09/06/2025")){
                    System.out.println("please Enter a Valid Delivery Date ");
                }else{
                    System.out.println("The Delivery Date is "+" "+Ddate);
                    System.out.println("Thank you For Purchasing with us");
                }
            } else if (ch.equals("3") || ch.equals("Vector") || ch.equals("vector")) {
                System.out.println("You Selected $8000: Vector Racket ");
                System.out.print("please confirm the price y or 0 = yes & 1 or n = no : ");
                price = sc.next();
                if (price.equals("0") || price.equals("y")) {
                    System.out.println("the price is $8000");
                }System.out.println("Thank you for choosing the brand");
                System.out.println("Please Enter  the Delivery Date the Delivery date should be in the format and after  09/06/2025 or dd/MM/yyyy");
                Ddate = sc.next();
                if(Ddate .equals("09/06/2025")){
                    System.out.println("please Enter a Valid Delivery Date ");
                }else{
                    System.out.println("The Delivery Date is "+" "+Ddate);
                    System.out.println("Thank you For Purchasing with us");
                }
            } else {
                System.out.println("please Select a valid Racket");
            }
    }
}
