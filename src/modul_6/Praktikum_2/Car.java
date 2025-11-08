package modul_6.Praktikum_2;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors){
        super(brand, speed); // memanggil consructor superclass
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void start() {
        super.start(); // memanggil method start dari superclass
        System.out.println("Car engine is running smoothly");
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // memanggil method displayInfo dari superclass
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    public void honk(){
        System.out.println("Beep beep!");
    }
}
