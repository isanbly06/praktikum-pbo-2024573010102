package modul_2;

import java.util.Scanner;

public class InputOutputDemo {
    public static void main(String[] args) {
        //membuat objek scanner
        Scanner input = new Scanner(System.in);

        //membaca inout string
        System.out.print("Masukkan nama anda: ");
        String nama = input.nextLine();

        //membaca input integer
        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();

        //membaca input double
        System.out.print("Masukkan tinggi anda(cm): ");
        double tinggi = input.nextDouble();

        // menampilkan output
        System.out.print("\n== data anda == ");
        System.out.print("Nama: " + nama);
        System.out.print("Umur: " + umur);
        System.out.print("Tinggi: " + tinggi + " cm");

        // menutup close
        input.close();


    }
}
