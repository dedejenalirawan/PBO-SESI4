package Kombinasi_Overloading_dan_Overriding;

/**
 *
 * @author Dede Jenal Irawan
 */
public class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

