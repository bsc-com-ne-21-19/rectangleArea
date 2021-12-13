
/**
 * @author BSC-COM-NE-21-19 This program calculates area of a rectangle
 */

import java.util.Scanner;

public class AreaOfRectangle {

    // main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // scanner instance
        System.out.println("Enter length: "); // prompt user for length
        double length = scanner.nextDouble();

        System.out.println("Enter breadth: "); // prompt user for breadth
        double breadth = scanner.nextDouble();

        // instantiating the area class
        Area area = new Area(length, breadth);

        System.out.println("The area is " + area.returnArea()); // printing area
    }
}