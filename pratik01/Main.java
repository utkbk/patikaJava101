package pratik01;

import java.util.Scanner;

public class Main {
    //Simple program that calculates the average of the grades and determines whether the student has passed or failed.
    public static void main(String args[]) {
        int mat, physcis, chemistery, turkish, history, music;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Math, Physics, Chemistry, Turkish, History and Music grades respectively: ");
        mat = input.nextInt();
        physcis = input.nextInt();
        chemistery = input.nextInt();
        turkish = input.nextInt();
        history = input.nextInt();
        music = input.nextInt();
        input.close();

        int sum = mat + physcis + chemistery + turkish + history + music;
        double result = sum / 6.0;
        System.out.println("Average: " + result);

        boolean passed = result >= 60, failed = result <= 100;
        boolean finalResult = passed && failed;
        System.out.println("Durum: " + (finalResult == true ? "Sinifi Gecti" : "Sinifta Kaldi"));
    }
}
