package day01;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Number");
        int firstnumber = scan.nextInt();
        System.out.println("Enter Second Number");
        int secondnumber = scan.nextInt();
        System.out.println("Enter Last Number");
        int lasttnumber = scan.nextInt();

        int sum = (firstnumber+secondnumber+lasttnumber)/3;
        System.out.println("Average The of The Number is : " + sum);

        /*
    Write a Java program that takes three numbers as input
    calculate and print the average of the numbers
    Test Data : 1st: 10 ,2nd:20, 3rd:30
    Output :(1st+2nd+3rd) / 3

​
        Scanner scan = new Scanner(System.in);
​
        System.out.println("Input the first number");
        int firstNumber = scan.nextInt();
​
        System.out.println("Input the second number");
        int secondNumber = scan.nextInt();
​
        System.out.println("Input the third number");
        int thirdNumber = scan.nextInt();
​
        int averageNumber ;
​
        averageNumber = (firstNumber+secondNumber+thirdNumber)/3 ;
        System.out.println("The Average of thre numbers :"+averageNumber); */


    }
}
