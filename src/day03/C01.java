package day03;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        //Get a number from the user and print the number in writing.
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter A Number");
        int number = scan.nextInt();

        switch (number){
            case 0 :
                System.out.println("Zero");
                break;
            case 1 :
                System.out.println("One");
                break;
            case 3:
                System.out.println("Two");
                break;
            case 4:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid Number. Please Enter A number Between 0-3");
        }
    }
}
