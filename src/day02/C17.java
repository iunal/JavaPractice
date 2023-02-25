package day02;

import java.util.Scanner;

public class C17 {
    public static void main(String[] args) {

        //Get the gender and age from the user.
        // Female, 60 years old and over, Male 65 years and older can retire.
        // Print “You can retire” or “You need to work .. more years to retire”,
        //taking into account gender and age.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Gender");
        char gender = scan.next().toUpperCase().charAt(0);
        System.out.println("Please Enter Your Age");
        int age = scan.nextInt();

        if ((gender == 'F' && age >= 60) || gender == 'M' && (age >= 65)){
            System.out.println("You Can Retire");
        } else if (gender == 'F' && age < 60) {
            System.out.println("You Need To Work " + (60-age) + " More Years To Retire");
        } else if (gender == 'M' && age < 65) {
            System.out.println("You Need To Work " + (65-age) + " More Years To Retire");
        }

        }
    }

