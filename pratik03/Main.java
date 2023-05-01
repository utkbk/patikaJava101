package pratik03;

import java.util.Scanner;

public class Main {
    // Area calculation of a right angled triangle.
    public static void main(String args[]) {
        double a, b, c, area, perimeter, u;
        System.out.println("Enter the sides of the triangle: ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        input.close();
        c = Math.sqrt(a * a + b * b);
        perimeter = a + b + c; // 2u
        u = perimeter / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.println("Area: " + area);
    }
}
