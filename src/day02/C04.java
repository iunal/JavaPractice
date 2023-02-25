package day02;

import java.util.Scanner;

public class C04 {
    public static void main(String[] args) {

        //Take a letter from the user and print the next 3 letters in the alphabet.

        Scanner scan = new Scanner(System.in);
        char letter, nextLetter;

        System.out.println("Please Enter A Letter : ");
        letter = scan.next().charAt(0);
        nextLetter = (char)(letter+1);
        System.out.println("The Next Letter : " + nextLetter);


    }
}
