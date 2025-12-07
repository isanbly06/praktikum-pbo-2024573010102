package latihanujian.per1;

public class main {
    public static void main(String[] args) {
        Pegawai p = new Pegawai("Rani", 5000000);

        // Akses langsung dilarang, jadi kita harus menggunakan setter yang terkontrol
        p.setGaji(-1000000);

        // Gunakan getter untuk menampilkan data
        System.out.println("Pegawai: " + p.getNama() + ", Gaji: " + p.getGaji());
    }
}
