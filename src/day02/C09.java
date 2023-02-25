package day02;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        // Ask the user for a number, check the number and print “Number a multiple of 5”
        // if it is divisible by 5.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number : ");
        int number = scan.nextInt();

        if (number%5 == 0) {
            System.out.println("Number a multiple of 5");
        } else System.out.println("Can not dividable of 5");

    }
}
