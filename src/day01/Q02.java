package day01;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstnumber = scan.nextInt();
        System.out.println("Enter Second Number");
        int secondnumber = scan.nextInt();
        int sumOfTwoNumbers = firstnumber + secondnumber;
        System.out.println(sumOfTwoNumbers);
    }

}
