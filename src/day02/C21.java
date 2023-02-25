package day02;

import java.util.Scanner;

public class C21 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl girin: ");
        int year = input.nextInt();

        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
