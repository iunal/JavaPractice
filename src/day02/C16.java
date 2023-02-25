package day02;

import java.util.Scanner;

public class C16 {
    public static void main(String[] args) {

        //Ask the user for a letter,
        // if the entered character is lowercase, print it in uppercase,
        //otherwise print the entered letter

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Letter");
        char letter = scan.next().charAt(0);

        if (letter >= 'a' && letter <= 'z') {
            System.out.println(Character.toUpperCase(letter));
        } else System.out.println(letter);
    }
}
