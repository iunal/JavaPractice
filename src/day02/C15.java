package day02;

import java.util.Scanner;

public class C15 {
    public static void main(String[] args) {

        //Ask the user to enter a character,
        // print whether the entered character is uppercase or not.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Character");
        char letter = scan.next().charAt(0);

        if (letter >= 65 && letter <= 90) {
            System.out.println("Capital Letter");
        } else if (letter >= 97 && letter <= 122) {
            System.out.println("Lowercase Letter");
        }

    }
}
