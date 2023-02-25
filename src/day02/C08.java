package day02;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        //Let's take a positive 4-digit integer from the user and
        // find the sum of the digits

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter 4 Digit Number");
        int number = scan.nextInt();

        int sum = 0;

        sum = sum + number%10;
        number= number/10;

        sum = sum + number%10;
        number= number/10;

        sum = sum + number%10;
        number= number/10;

        sum= sum + number%10;

        System.out.println(sum);
    }
}
