package day03;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        //Get a 2-digit number from the user and print the entered number with text

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 2-Digit Number");
        int number = scan.nextInt();

        switch (number) {
            case 10 :
                System.out.println("Ten");
                break;
            case 11:
                System.out.println("Eleven");
                break;
            case 12:
                System.out.println("Twelve");
                break;
            default:
                System.out.println("Please Enter Two Digit Number Between 10-12");
        }

    }
}
