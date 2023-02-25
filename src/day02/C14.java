package day02;

import java.util.Scanner;

public class C14 {
    public static void main(String[] args) {
        //Ask the user's age, print "You can retire"
        // if he is 65 years or older,
        // otherwise print the number of years he has to work to retire.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Age : ");
        int age = scan.nextInt();

        if (age >= 65) {
            System.out.println("You Can Retire");
        } else System.out.println("You Must Work " + (65-age) + " Years");
    }
}
