package day03;

import java.util.Locale;

public class C07 {
    public static void main(String[] args) {

        String str = "Java is Life";
        // print str in capital letters
        System.out.println(str.toUpperCase()); //JAVA IS LIFE
        System.out.println(str); //Java is Life
        str = str.toUpperCase();
        System.out.println(str); //JAVA IS LIFE
        System.out.println(str.toLowerCase()); //java is life
        str=str.toLowerCase();
        System.out.println(str.toLowerCase(Locale.ENGLISH)); //java is life
        System.out.println(str.toLowerCase(Locale.CHINESE)); //java is life
    }
}
