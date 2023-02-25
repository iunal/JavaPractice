package day02;

import java.util.Scanner;

public class C20 {
    public static void main(String[] args) {

        // Get the distance from the user in kilometers
        // and ask the unit he wants to convert to ,
        // if the unit he wants is meters or centimeters, convert and print it,
        // otherwise print "the unit you want is not registered to the system".

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter The Distance (km) : ");
        double distance = scan.nextDouble();
        System.out.println("Please Select New Unit (m or cm)");
        char unit = scan.next().toUpperCase().charAt(0);

        double newDistanceMeter = distance * 1000;
        double newDistanceCm = distance * 100000;

        if (unit == 'M') {
            System.out.println(newDistanceMeter);
        } else if (unit == 'C') {
            System.out.println(newDistanceCm);
        } else System.out.println("the unit you want is not registered to the system");


    }
}
