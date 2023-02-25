package day02;

import java.util.Scanner;

public class C10 {
    public static void main(String[] args) {

        // Get a letter from the user, print it if there is a month that starts with a letter.
        // NOTE: No uppercase or lowercase sensitivity. When the user types j or J , output is Jan

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Letter : ");
        char letter = scan.next().charAt(0); // char letter = scan.next().toUpperCase().charAt(0)


        if (letter == 'J' || letter == 'j') {
            System.out.println("January");
        } else if (letter == 'F')
            System.out.println("February");{

        }


    }
}
