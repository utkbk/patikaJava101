package hw01;

import java.util.Scanner;

public class Main {
    // Simple program that calculates body mass index.
    public static void main(String args[]) {
        double weight, height, BMI;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your weight and height respectively(kg, m): ");
        weight = input.nextDouble();
        height = input.nextDouble();
        input.close();
        BMI = weight / (height * height);
        System.out.println("BMI: " + BMI);
    }
}
