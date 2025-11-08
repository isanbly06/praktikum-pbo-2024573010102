package modul_7.praktikum_2;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public void draw() {
        System.out.println("Menggambar lingkaran dengan warna: " + color + " dan radius  " + radius);
    }

    public double calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("luas lingkaran: " + area);
        return area;
    }

    @Override
    public void displayInfo() {
        System.out.println("Lingkaran - warna: " + color + ", Radius: " + radius);
    }
}
