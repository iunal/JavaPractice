package day02;

import java.util.Scanner;

public class C07 {
    public static void main(String[] args) {

        //Get a double and an integer from the user, divide the double number by the second number
        //and print the integer part of the result of the division operation.

        Scanner scan = new Scanner(System.in);

        double firstNumber, divide;
        int secondNumber, printNumber;

        System.out.println("Please Enter a Double Number : ");
        firstNumber = scan.nextDouble();
        System.out.println("Please Enter a Integer Number : ");
        secondNumber = scan.nextInt();

        divide = firstNumber/secondNumber;
        printNumber = (int)(divide);

        System.out.println(printNumber);

    }
}
