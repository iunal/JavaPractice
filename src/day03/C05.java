package day03;

import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Day Number");
        byte dayNumber = scan.nextByte();

        switch (dayNumber){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Week Days");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Please Enter A Number Between 1-7");
        }
    }
}
