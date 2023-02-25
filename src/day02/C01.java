package day02;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Get values in three different data types from the user
        // and print the entered values with their explanations.

        Scanner scan = new Scanner(System.in);

        String nameAndSurname;
        int age;
        char gender;

        System.out.println("Please Enter Your Name and Surname : ");
        nameAndSurname = scan.nextLine();
        System.out.println("Please Enter Your Age : ");
        age = scan.nextInt();
        System.out.println("Please Enter Your Gender : ");
        gender = scan.next().charAt(0);

        System.out.println("Your Name : " + nameAndSurname);
        System.out.println("Your Age : " + age);
        System.out.println("Your Gender : " + gender);
        System.out.println("Your Registration is Completed");



    }
}
