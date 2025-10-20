package modul_4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\tSISTEM KARTU RENCANA STUDI (KRS)");
        System.out.println("-------------------------------------------------------------");

        // Input data mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        // Membuat object mahasiswa
        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);

        // Membuat object KRS (maksimal 10 mata kuliah)
        RencanaKartuStudi krs = new RencanaKartuStudi(mhs, 10);

        // Menu KRS
        boolean running = true;
        while (running) {
            System.out.println("\n-------------------------------------------------------------");
            System.out.println("\t\t\tMENU KRS");
            System.out.println("-------------------------------------------------------------");
            System.out.println("1. Tambah Mata Kuliah");
            System.out.println("2. Input Nilai Mata Kuliah");
            System.out.println("3. Tampilkan KRS");
            System.out.println("4. Hapus Mata Kuliah");
            System.out.println("5. Tampilkan Mata Kuliah Terbaik & Terburuk");
            System.out.println("6. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    System.out.println("\nTAMBAH MATA KULIAH");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();
                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();
                    System.out.print("Jumlah SKS: ");
                    int sks = input.nextInt();
                    input.nextLine();

                    MataKuliah mk = new MataKuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    System.out.println("\nINPUT NILAI");
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();

                    MataKuliah mkaCari = krs.cariMatakuliah(kodeCari);
                    if (mkaCari != null) {
                        System.out.print("Nilai (0–100): ");
                        double nilai = input.nextDouble();
                        input.nextLine();
                        mkaCari.setNilai(nilai);
                        System.out.println("Nilai berhasil diinput!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 3:
                    krs.tampilkanKRS();
                    break;

                case 4:
                    System.out.println("\nHAPUS MATA KULIAH");
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;

                case 5:
                    krs.tampilkanMatkulTerbaikDanTerburuk();
                    break;

                case 6:
                    System.out.println("Terima kasih telah menggunakan program ini !");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}

