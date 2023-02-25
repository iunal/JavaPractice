package day03;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        //Kullanicidan ay numarasini alip ay ismini yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Month Number");
        int number = scan.nextInt();

        switch (number){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            default:
                System.out.println("Please Enter A Number Between 1-3");
        }

    }
}
