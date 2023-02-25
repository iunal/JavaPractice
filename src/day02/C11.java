package day02;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {

        //Get a number from the user, print
        // “Number divisible by 3” if the number is divisible by 3,
        // “Number divisible by five” if it is divisible by 5.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int number = scan.nextInt();

        if (number%3 == 0) {
            System.out.println("Number Divisible By 3");
        } if (number%5 == 0) {
            System.out.println("Number Divisible By 5");
        }




    }
}
