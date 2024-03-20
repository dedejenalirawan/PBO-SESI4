package Kombinasi_Overloading_dan_Overriding;

/**
 *
 * @author Dede Jenal Irawan
 */
public class Circle extends Shape  {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

