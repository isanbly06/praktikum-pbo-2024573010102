package modul_8.praktikum_2;

public interface Vehicle {
    // constant fields (public static final by default)
    int MAX_SPEED = 200;

    //Abstract methods (public abstract by default)
    void start();
    void stop();
    void accelerate(double speed);
    void brake();

    //default method (java 8+)

    default void honk(){
        System.out.println("Beep beep!");
    }

    static void displayMaxSpeed(){
        System.out.println("Maximun speed for all vehicles: " + MAX_SPEED + "km/h");
    }
}
