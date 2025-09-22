package modul_2;

public class VariabelDemo {
    public static void main(String[] args) {
        // deklarasi dan inisialisasi variabel

        int umur = 20;
        double tinggi = 175.5;
        char grade = 'A';
        boolean lulus = true;
        String nama = "John Doe";

        // menampilkan nilai variabel
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur +"tahun");
        System.out.println("Lulus: " + lulus);
        System.out.println("Grade: " + grade);
        System.out.println("Tinggi: " + tinggi+" cm");

        int a =10;
        int b =3;

        System.out.println("\n==operasi aritmatika==");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("\n==casting tipe data==");
        double nilaiDouble = 9.8;
        int nilaiInt = (int) nilaiDouble;

        System.out.println("nilaiDouble = " + nilaiDouble);
        System.out.println("setelah casting ke int = " + nilaiInt);

        //automatic promotion
        byte byteVar = 50;
        short shortVar = 100;
        int hasil = byteVar + shortVar;
        System.out.println("byte + short = " + hasil + "(tipe: int)");



    }
}
