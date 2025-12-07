package modul_8.praktikum_1;

import java.awt.*;

public class Circle extends Shape {
    private double radius;

    public Circle( String Color, boolean filled, double radius ) {
        super(Color, filled);
        this.radius = radius;
    }

    //implementasi abstract methods


    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    // override concrete methods
    public void displayInfo() {
        System.out.println("CIRCLE");
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
        System.out.println("===============");
    }

    //method khusus circle
    public double getDiameter() {
        return 2 * radius;
    }
}
