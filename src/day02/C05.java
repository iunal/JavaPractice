package day02;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        //- Get a number from the user, no matter whatever value the user enters,
        //convert that number to a number between -128 and 127 and print it.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number : ");

        int number = scan.nextInt();
        byte newNumber = (byte) number;

        System.out.println(newNumber);

    }
}
