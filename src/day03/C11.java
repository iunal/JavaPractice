package day03;

public class C11 {
    public static void main(String[] args) {

        String str = "Java";
        System.out.println(str.length()); //4 // length gives number of characters

        String str2 = "şasldkfjşaslkfjaşlsdkfjşklsdjfpweruqpoırupqowerıE";
        System.out.println(str2.length()); //49
        System.out.println(str2.charAt(48)); //E
        System.out.println(str2.charAt(str2.length()-1)); //E
    }
}
