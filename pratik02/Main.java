package pratik02;

import java.util.Scanner;

public class Main {
    //Simple program that calculates the VAT of a product, and the price with VAT, and the price without VAT and the VAT rate.
    public static void main(String args[]) {
        double VAT_RATE = 0.18;
        double price, VAT, priceWithVAT;
        System.out.println("Enter the price: ");
        
        Scanner input = new Scanner(System.in);
        price = input.nextDouble();
        input.close();

        if (price > 1000) {
            VAT_RATE = 0.08;
        }

        VAT = price * VAT_RATE;
        priceWithVAT = price + VAT;
        System.out.println("VAT: " + VAT);
        System.out.println("Price with VAT: " + priceWithVAT);
        System.out.println("Price without VAT: " + price);
        System.out.println("VAT Rate: " + VAT_RATE);
    }
}
