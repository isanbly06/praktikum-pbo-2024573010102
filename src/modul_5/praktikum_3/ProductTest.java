package modul_5.praktikum_3;
import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("SISTEM MANAJEMEN PRODUK");

        // Membuat produk dengan PIN
        Product laptop = new Product("Laptop ASUS", 8500000, 15, "1234");
        Product mouse = new Product("Mouse Logitech", 150000, 50, "1234");

        System.out.println("PRODUK BERHASIL DIBUAT");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        // TEST READ-ONLY PROPERTIES
        System.out.println("TEST READ-ONLY PROPERTIES");
        System.out.println("Product ID (read-only): " + laptop.getProductId());
        System.out.println("Created At (read-only): " + laptop.getCreatedAt());
        System.out.println("✓ Properti ini TIDAK BISA diubah setelah dibuat");

        // TEST READ-WRITE PROPERTIES
        System.out.println("TEST READ-WRITE PROPERTIES");

        // Test 1: Ubah harga tanpa PIN (akan gagal)
        System.out.println("\n1. Mencoba ubah harga dengan PIN salah:");
        laptop.setHarga(9000000, "0000");

        // Test 2: Ubah harga dengan PIN benar
        System.out.println("\n2. Ubah harga dengan PIN benar:");
        laptop.setHarga(9000000, "1234");

        // Test 3: Ubah nama
        System.out.println("\n3. Ubah nama produk:");
        laptop.setNama("Laptop ASUS ROG", "1234");

        // Test 4: Ubah stok
        System.out.println("\n4. Ubah stok:");
        laptop.setStok(20, "1234");

        // TEST WRITE-ONLY PROPERTY
        System.out.println("TEST WRITE-ONLY PROPERTY (PIN)");
        System.out.println("PIN tidak bisa dibaca (tidak ada getter)");
        System.out.println("Hanya bisa diubah dengan validasi PIN lama:");
        laptop.changeAdminPin("1234", "5678");
        laptop.changeAdminPin("0000", "9999"); // Akan gagal

        //test cumpoted property
        System.out.println("TEST COMPUTED PROPERTIES");
        System.out.printf("Total Nilai Laptop : Rp %.2f\n", laptop.getTotalNilai());
        System.out.println("Status Stok laptop : " + laptop.getStatusStok());
        System.out.printf("Total Nilai Mouse : Rp%.2f\n", mouse.getTotalNilai());
        System.out.println("Status Stok mouse : " + mouse.getStatusStok());

        // test business methods
        System.out.println("Test BUSINESS PROPERTIES");

        System.out.println("\n1. Tambah Stok Laptop:");
        laptop.tambahStok(10,"5678"); // pin sudah diubah

        System.out.println("\n2. Kurangi Stok mouse (penjualan):");
        mouse.kurangiStok(45);

        System.out.println("\n3.Kurangi Stok mouse lagi(stok akan menipis):");
        mouse.kurangiStok(4);

        System.out.println("\n4.Coba Kurangi stok lebih lebih dari tersedia");
        mouse.kurangiStok(10);

        //Tampilkan info akhir
        System.out.println("Informasi Produk setelah Update");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        //ringkasan encapsulation
        System.out.println("RINGKASAN ENCAPSULATION");
        System.out.println("-----------------------");
        System.out.println("READ-0ONLY       :productId, createdAt       ");
        System.out.println("                (tidak bisa diubah)          ");
        System.out.println("                                             ");
        System.out.println("READ-WRITE       :nama, harga, stok          ");
        System.out.println("                (dengan validasi)            ");
        System.out.println("                                             ");
        System.out.println("WRITE-ONLY       :adminPin                   ");
        System.out.println("                (tidak bisa dibaca)          ");
        System.out.println("                                             ");
        System.out.println("COMPUTED        :totalNilai, statusStok      ");
        System.out.println("                (dihitung otomatis)          ");
    }
}

