package day02;

import java.util.Scanner;

public class C06 {
    public static void main(String[] args) {

        //Take two double numbers from the user, divide the first number by the second number
        //and print the integer part of the result of the division operation.

        Scanner scan = new Scanner(System.in);
        double firstNumber, secondNumber, division;
        int divisionResult;

        System.out.println("Enter First Double Number : ");
        firstNumber = scan.nextDouble();
        System.out.println("Enter Second Double Number : ");
        secondNumber = scan.nextDouble();

        division = firstNumber/secondNumber;
        divisionResult = (int) division;

        System.out.println(divisionResult);

    }
}
