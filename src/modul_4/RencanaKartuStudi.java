package modul_4;

public class RencanaKartuStudi {
    private Mahasiswa mahasiswa;
    private MataKuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private int maxMatkul;

    // Batas total SKS (misalnya 24)
    private final int BATAS_SKS = 24;

    public RencanaKartuStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new MataKuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // Menambah mata kuliah ke KRS dengan validasi SKS
    public boolean tambahMatakuliah(MataKuliah matkul) {
        int totalSksBaru = hitungTotalSKS() + matkul.getSks();
        if (totalSksBaru > BATAS_SKS) {
            System.out.println("\nNote: Total SKS melebihi batas (" + BATAS_SKS + " SKS)! Tidak bisa menambah mata kuliah.");
            return false;
        }

        if (jumlahMatkul < maxMatkul) {
            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nNote: Mata kuliah " + matkul.getNama() + " berhasil ditambahkan.");
            return true;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Menghapus mata kuliah berdasarkan kode
    public boolean hapusMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                System.out.println("\nNote: Mata kuliah " + daftarMatakuliah[i].getNama() + " telah dihapus.");
                // Geser elemen setelahnya
                for (int j = i; j < jumlahMatkul - 1; j++) {
                    daftarMatakuliah[j] = daftarMatakuliah[j + 1];
                }
                daftarMatakuliah[jumlahMatkul - 1] = null;
                jumlahMatkul--;
                return true;
            }
        }
        System.out.println("\nNote: Mata kuliah dengan kode " + kode + " tidak ditemukan.");
        return false;
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    // Menghitung IPK
    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;
        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            MataKuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    // Menampilkan KRS
    public void tampilkanKRS() {
        System.out.println("-------------------------------------------------------------");
        System.out.println("\t\t\tKARTU RENCANA STUDI (KRS)");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Nama Mahasiswa\t: " + mahasiswa.getNama());
        System.out.println("NIM\t\t: " + mahasiswa.getNim());
        System.out.println("Jurusan\t\t: " + mahasiswa.getJurusan());
        System.out.println("-------------------------------------------------------------");
        System.out.println("NO\tMATA KULIAH\t\tSKS\tNILAI\n");
        System.out.println("-------------------------------------------------------------");

        if (jumlahMatkul > 0) {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        } else {
            System.out.println("Belum ada mata kuliah yang diambil.");
        }

        System.out.println("-------------------------------------------------------------");
        System.out.println("Total SKS\t\t\t: " + hitungTotalSKS());
        System.out.printf("IPK Semester\t\t: %.2f%n", hitungIPK());
        System.out.println("-------------------------------------------------------------\n");
    }

    // Menampilkan mata kuliah dengan nilai terbaik dan terburuk
    public void tampilkanMatkulTerbaikDanTerburuk() {
        if (jumlahMatkul == 0) {
            System.out.println("Belum ada data mata kuliah!");
            return;
        }

        MataKuliah terbaik = daftarMatakuliah[0];
        MataKuliah terburuk = daftarMatakuliah[0];

        for (int i = 1; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getNilai() > terbaik.getNilai()) {
                terbaik = daftarMatakuliah[i];
            }
            if (daftarMatakuliah[i].getNilai() < terburuk.getNilai()) {
                terburuk = daftarMatakuliah[i];
            }
        }

        System.out.println("\n--- Mata Kuliah Terbaik ---");
        System.out.println("Nama: " + terbaik.getNama() + " | Nilai: " + terbaik.getNilai());
        System.out.println("--- Mata Kuliah Terburuk ---");
        System.out.println("Nama: " + terburuk.getNama() + " | Nilai: " + terburuk.getNilai());
    }

    // Mencari mata kuliah berdasarkan kode
    public MataKuliah cariMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }
}
