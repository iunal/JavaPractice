package day01;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter First Number");
        double number1 = scan.nextInt();
        System.out.println("Please Enter Second Number");
        double number2 = scan.nextInt();
        double dividinfOfTwoNumbers = number1/number2;
        System.out.println("The Result Is : " + dividinfOfTwoNumbers);


    }
}
