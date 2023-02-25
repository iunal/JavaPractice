package day02;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {

        //Write a code that prints the average of 3 int values as double

        Scanner scan = new Scanner(System.in);
        int firstNumber, secondNumber, thirdNumber;
        double averageNumber;

        System.out.println("Please Enter A Number as Integer : ");
        firstNumber = scan.nextInt();
        System.out.println("Please Enter A Number as Integer : ");
        secondNumber = scan.nextInt();
        System.out.println("Please Enter A Number as Integer : ");
        thirdNumber = scan.nextInt();

        averageNumber = (firstNumber+secondNumber+thirdNumber)/3;
        System.out.println("Average Number as Double is : " + averageNumber);
    }
}
