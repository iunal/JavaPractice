package day02;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {

        // Get each length of a triangle’s 3 sides from the user,
        // and if the triangle is equilateral, print "Equilateral Triangle".

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter First Side Of Triangle");
        double firstSide = scan.nextDouble();
        System.out.println("Enter Second Side Of Triangle");
        double secondSide = scan.nextDouble();
        System.out.println("Enter Third Side Of Triangle");
        double thirdSide = scan.nextDouble();

        if ((firstSide == secondSide) && (firstSide == thirdSide )) {
            System.out.println("Equilateral Triangle");
        } else System.out.println("Not Equilateral Triangle");

    }
}
