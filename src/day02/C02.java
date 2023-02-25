package day02;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        //Take a double and an int number from the user and print their sum and product.

        Scanner scan = new Scanner(System.in);
        double firstNumber;
        int secondNumber;
        double sumOfTwoNumbers;


        System.out.println("Please Enter a Double Number : ");
        firstNumber = scan.nextDouble();
        System.out.println("Please Enter a Integer Number : ");
        secondNumber = scan.nextInt();

        sumOfTwoNumbers = (firstNumber+secondNumber);
        System.out.println("The Sum Of Number's Is : " + sumOfTwoNumbers);


    }
}
