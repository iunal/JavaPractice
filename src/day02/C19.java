package day02;

import java.util.Scanner;

public class C19 {
    public static void main(String[] args) {

        //Get the number of products purchased from the user and the list price,
        // and ask the user if they have a customer card.
        // If the customer has a card and buys more than 10 items, 20% off, otherwise 15% off.
        //If the customer does not have a card, 15% off if he buys more than 10 products, 10% off if he does not

        Scanner scan = new Scanner(System.in);
        System.out.println("Number Of Products");
        int product = scan.nextInt();
        System.out.println("List Price");
        double price = scan.nextDouble();
        System.out.println("Do You Have Customer Card (Y/N)");
        char card = scan.next().toUpperCase().charAt(0);
        double amount = product*price;

        if (card == 'Y' && product > 10){
            System.out.println("You have 20% discount, your final amount is : " + amount*0.8);
        } else if (card == 'Y' && product <= 10) {
            System.out.println("You have 15% discount, your final amount is : " + amount*0.85);
        } else if (card == 'N' && product > 10) {
            System.out.println("You have 15% discount, your final amount is : " + amount*0.85);
        } else System.out.println("You have 10% discount, your final amount is : " + amount*0.9);
    }
}
