package hw02;

import java.util.Scanner;

public class Main {
    // Armut, Elma, Domates, Muz, Patlıcan
    public static void main(String args[]) {
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00;
        double armutKG, elmaKG, domatesKG, muzKG, patlicanKG, total;
        Scanner input = new Scanner(System.in);
        System.out.println("How many kg of armut do you want to buy?");
        armutKG = input.nextDouble();
        System.out.println("How many kg of elma do you want to buy?");
        elmaKG = input.nextDouble();
        System.out.println("How many kg of domates do you want to buy?");
        domatesKG = input.nextDouble();
        System.out.println("How many kg of muz do you want to buy?");
        muzKG = input.nextDouble();
        System.out.println("How many kg of patlican do you want to buy?");
        patlicanKG = input.nextDouble();
        total = armut * armutKG + elma * elmaKG + domates * domatesKG + muz * muzKG + patlican * patlicanKG;
        System.out.printf("Total price: %.2f TL", total);
    }
}
