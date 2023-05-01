package pratik04;

import java.util.Scanner;

public class Main {
    //Area and perimeter calculation of a circle.s
    public static void main(String args[]) {
        double perimeter, area, angle;
        int radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        radius = input.nextInt();
        System.out.println("Enter the angle for the area to calculate: ");
        angle = input.nextDouble();
        input.close();

        perimeter = 2 * Math.PI * radius;
        area = Math.PI * radius * radius * angle / 360;

        System.out.printf("Perimeter of whole circle: %.2f \n", perimeter);
        System.out.printf("Area of the angle: %.2f", area);
    }
}
