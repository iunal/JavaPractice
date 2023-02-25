package day04;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {
        /*
 --Your are working in sales and have to calculate commission for the employees;
 -- You need to ask the  user for a sales amount, and based on the amount, you need to
 define their commission.
 -- If user sold products for more than 10$ but less than 100$  ==> commission is 10%
 -- If user sold products for more than 100$ but less than 200$ ==> commission is 20%
 -- If user sold products for more than 200$ but less than 500$ ==> commission is 30%
 -- If user sold products for more than 500$ ==> commission is 50%
 Your program should print How much in commission the  user will get...
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Sales Amount");
        double sales = scan.nextDouble();

        if (sales <= 10){
            System.out.println("You Can not get commission under 10$ ");
        } else if (sales > 10 && sales < 100) {
            System.out.println("Your Comission is: " + sales * 0.1);
        } else if (sales >= 100 && sales < 200) {
            System.out.println("Your Comission is: " + sales * 0.2);
        } else if (sales >=200 && sales < 500) {
            System.out.println("Your Comission is: " + sales * 0.3);
        } else if (sales >=500){
            System.out.println("Your Comission is: " + sales * 0.5);
        }


    }
}
