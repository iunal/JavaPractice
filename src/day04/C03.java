package day04;

import java.util.Scanner;

public class C03 {
    public static void main(String[] args) {
        /*
Write a Java program to compute body mass index (BMI) of a person.
BMI = kg / (height * height)(cm)
Expected Output:
BMI<=18.5, underweight
18.5<BMI<24.9 ,healthy range
25<=BMI<29.9,overweight
30<=BMI<34.9,obese
35<=BMI<39.9, severe obesity.
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Your Weight (kg)");
        double weight = scan.nextDouble();
        System.out.println("Please Enter Your Height cm)");
        double height = scan.nextDouble();
        double bmi = weight/(height*height);

        if (bmi<=18.5){
            System.out.println("Underweight");
        } else if (bmi > 18.5 && bmi < 24.9 ) {
            System.out.println("Health Range");
        } else if (bmi >=25 && bmi <29.9) {
            System.out.println("Overweight");
        } else if (bmi >=30 && bmi < 34.9) {
            System.out.println("Obese");
        } else if (bmi >=35 && bmi < 39.9) {
            System.out.println("Severe Obesity");
        }

    }
}
