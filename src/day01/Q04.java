package day01;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        /*
Write a program tp print the sum, multiply, subtract,divide and remainder of two numbers
Test Data: firstNumber = 125,secondNumber = 24
Expected Output:
125+24=149
125-24=101
125x24=
125/24=5
125/24 remainder is 5
 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int firstnumber = scan.nextInt();
        System.out.println("Enter Second Number :");
        int secondnumber = scan.nextInt();

        int sumOfTwoNumbers,subtractTwoNumbers,dividingTwoNumbers,multiplyingNumbers,remainderOfNumbers ;

        sumOfTwoNumbers = firstnumber+secondnumber;
        System.out.println("The Sum Of Two Number is : " + sumOfTwoNumbers);

        subtractTwoNumbers = firstnumber-secondnumber;
        System.out.println("The Subtract Of Two Number is : " + subtractTwoNumbers);

        dividingTwoNumbers = firstnumber/secondnumber;
        System.out.println("The Dividing Of Two Number is : " + dividingTwoNumbers);

        multiplyingNumbers = firstnumber*secondnumber;
        System.out.println("The Multiplying of Two Number Is : " + multiplyingNumbers);

        remainderOfNumbers = firstnumber%secondnumber;
        System.out.println("The Remainder of Two Number Is : " + remainderOfNumbers);



    }
}
