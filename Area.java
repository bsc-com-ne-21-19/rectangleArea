/**
 * @author BSC-COM-NE-21-19 class to calculate area of rectangle
 */

public class Area {
    private double length, breadth;

    // no arg constructor
    public Area() {
        this(0, 0);
    }

    // arg constructor
    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // method to calculate and return area
    public double returnArea() {
        double area = length * breadth;
        return area;
    }

}
