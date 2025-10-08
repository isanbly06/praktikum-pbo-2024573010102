package modul_3.latihan;

import java.util.Scanner;

public class latihan6 {

    public static void prosesDataMahasiswa(String data) {
        String[] dataMahasiswa = data.split(";");
        System.out.println("\nANALISIS DATA");
        System.out.println("Jumlah mahasiswa: " + dataMahasiswa.length);

        for (int i = 0; i < dataMahasiswa.length - 1; i++) {
            for (int j = 0; j < dataMahasiswa.length - i - 1; j++) {
                if (dataMahasiswa[j].compareTo(dataMahasiswa[j + 1]) > 0) {
                    String temp = dataMahasiswa[j];
                    dataMahasiswa[j] = dataMahasiswa[j + 1];
                    dataMahasiswa[j + 1] = temp;
                }
            }
        }
    }

    public static void formatNama(String[] nama) {
        System.out.println("\nFORMAT NAMA, USERNAME & EMAIL");
        for (String namaLengkap : nama) {
            String namaFormatted = formatTitleCase(namaLengkap.trim()); // trim() untuk hapus spasi berlebih
            String username = buatUsername(namaFormatted);
            String email = buatEmail(namaFormatted);

            System.out.println("Nama Lengkap: " + namaFormatted);
            System.out.println("Username    : " + username);
            System.out.println("Email       : " + email); // Tampilkan email
            System.out.println("---");
        }
    }

    public static String formatTitleCase(String teks) {
        if (teks == null || teks.isEmpty()) {
            return "";
        }
        String[] kata = teks.split("\\s+");
        StringBuilder hasil = new StringBuilder();
        for (String k : kata) {
            if (k.length() > 0) {
                hasil.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return hasil.toString().trim();
    }

    public static String buatUsername(String nama) {
        String[] kata = nama.toLowerCase().split("\\s+");
        if (kata.length == 0) {
            return "";
        }
        StringBuilder username = new StringBuilder(kata[0]);
        if (kata.length > 1) {
            username.append(kata[1].charAt(0));
        }
        return username.toString();
    }

    public static String buatPassword(String nama) {
        // ... (kode di dalam method ini tetap sama, meskipun tidak dipanggil di main) ...
        String reversedName = new StringBuilder(nama).reverse().toString();
        return reversedName.replaceAll("(?i)[aeiou\\s]", "");
    }

    public static String buatEmail(String nama) {
        String username = buatUsername(nama);
        return username + "@sunleik.sl.id";
    }

    public static boolean isNamaValid(String nama) {
        // Regex: ^[a-zA-Z\s]+$
        // Artinya: String harus terdiri dari awal (^) sampai akhir ($)
        // hanya oleh karakter huruf (a-z, A-Z) dan spasi (\s).
        return nama.trim().matches("^[a-zA-Z\\s]+$");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" PENGOLAHAN DATA T");
        System.out.println("Masukkan nama-nama mahasiswa (';'):");
        System.out.print("> ");
        String dataInput = input.nextLine();

        // Memisahkan data input menjadi array
        String[] database = dataInput.split(";");

        // [BARU] Proses validasi input sebelum diproses lebih lanjut
        boolean semuaNamaValid = true;
        for (String nama : database) {
            if (!isNamaValid(nama)) {
                System.out.println("\n[ERROR] Input tidak valid!");
                System.out.println("Nama \"" + nama.trim() + "\" mengandung karakter selain huruf dan spasi.");
                semuaNamaValid = false;
                break; // Hentikan pengecekan jika satu nama sudah tidak valid
            }
        }

        // [BARU] Hanya jalankan proses jika semua nama valid
        if (semuaNamaValid) {
            // Proses data utama
            prosesDataMahasiswa(dataInput);

            // Format nama
            formatNama(database);
        }
    }
}

