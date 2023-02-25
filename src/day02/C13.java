package day02;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {

        // Get a note from the user.
        // If it is 50 or more, print “Pass the Class”,
        // if it is less than 50, Sorry,

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Score");
        double score = scan.nextDouble();

        if (score >= 50){
            System.out.println("Pass The Class");
        } else if (score <50) {
            System.out.println("Sorry Failed");
        }

    }
}
