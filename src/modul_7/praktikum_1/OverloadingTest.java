package modul_7.praktikum_1;

public class OverloadingTest {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // test berbagai versi method add
        System.out.println("Hasil: " + calculator.add(5, 10));
        System.out.println();

        System.out.println("Hasil: " + calculator.add(5, 10, 15));
        System.out.println();

        System.out.println("Hasil: " + calculator.add(5.4, 10.7));
        System.out.println();

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Hasil: " + calculator.add(numbers));
        System.out.println();

        System.out.println("Automatic Type promotion: ");
        System.out.println("Hasil: " + calculator.add(5, 3.5));
    }
}
