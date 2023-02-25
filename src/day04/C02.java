package day04;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        // Write a Java Program that shows what season you were born in.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Mount That You Were Born In");
        String month = scan.next().toUpperCase();

        String metin = "You were born in";
        switch (month){
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                System.out.println(metin + " Winter");
                break;
            case "MARCH":
            case "APRIL":
            case "MAY":
                System.out.println("You were born in Spring");
                break;
            case "JUNE":
            case "JULY":
            case "AUGUST":
                System.out.println("You were born in Summer");
                break;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                System.out.println("You were born in Fall");
                break;
            default:
                System.out.println("Please Enter Correct Month");
        }

    }
}
