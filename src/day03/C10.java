package day03;

public class C10 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Life";
        String str3 = " ";
        // use concat method to write "Java Life"
        System.out.println(str1 + str3 + str2); //Java Life
        System.out.println(str1.concat(str3.concat(str2))); //Java Life

    }
}
