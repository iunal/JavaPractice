package day03;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Day");
        String day = scan.next().toUpperCase();

        if (day.equals("SATURDAY") || day.equals("SUNDAY")) {
            System.out.println("HAPPY HOLIDAY");
        } else{
            if (day.equals("MONDAY")){
                System.out.println("5 more days to weekend");
            } else if (day.equals("FRIDAY")) {
                System.out.println("1 more days to weekend");
            }
        }

    }
}
