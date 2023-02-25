package day02;

import java.util.Scanner;

public class C18 {
    public static void main(String[] args) {

        //Ask for the user's weight (kg) and height (cm)
        // and calculate the body mass index (weight * 10000 / (height * height))
        //if the body mass index is greater than 30 obese,
        //between 25 30 overweight,
        // between 20 25 normal,
        // if less than 20 print thin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Weight (kg)");
        double weight = scan.nextDouble();
        System.out.println("Please Enter Your Height (cm)");
        double height = scan.nextDouble();
        double massIndex = (weight*10000)/(height*height);

        if (massIndex > 30){
            System.out.println("You Are Obese");
        } else if (massIndex >25) {
            System.out.println("You Are Overweight");
        } else if (massIndex > 20) {
            System.out.println("You Are Normal");
        } else System.out.println("You Are Thin");
            
        }
    }

