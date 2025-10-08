package modul_3.latihan;

import java.util.Arrays;

public class latihan1 {

    public static void main(String[] args) {
        // 1. Membuat array untuk menyimpan nilai ujian 10 siswa
        int[] nilaiUjian = {87, 91, 74, 75, 88, 95, 74, 60, 95, 71};
        String[] namaSiswa = {
                "Fatah", "Budiman", "Cica", "Darto", "Ello",
                "Fajar", "Gundam", "Sahroni", "Asep", "Joko"
        };

        // Inisialisasi variabel
        double totalNilai = 0;
        int nilaiTertinggi = nilaiUjian[0];
        int nilaiTerendah = nilaiUjian[0];

        // 2. Hitung total nilai dan cari nilai tertinggi serta terendah
        for (int nilai : nilaiUjian) {
            totalNilai += nilai;

            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }

            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        // 3. Hitung rata-rata
        double rataRata = totalNilai / nilaiUjian.length;

        // 4. Tampilkan nama dan nilai
        System.out.println("Daftar Nama dan Nilai Ujian:");
        System.out.println("==========================================");
        for (int i = 0; i < nilaiUjian.length; i++) {
            System.out.println(namaSiswa[i] + " = " + nilaiUjian[i]);
        }

        // 5. Tampilkan hasil akhir
        System.out.println("==========================================");
        System.out.printf("Rata-rata Nilai: %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah : " + nilaiTerendah);
    }
}
