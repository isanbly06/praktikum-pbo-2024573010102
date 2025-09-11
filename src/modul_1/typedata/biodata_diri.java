package modul_1.typedata;

public class biodata_diri {
    public static void main(String[] args) {
        String nim, nama, alamat, agama, jurusan, prodi, tempatlahir, anak, kampus;
        int tahunlahir, umur;
        double tinggi;
        char jenisKelamin;
        boolean statusMahasiswa;


        nim = "2024573010102";
        nama = "Ikhsan Salsabily";
        alamat = "Dusun Tanjong,Desa Lancang Barat";
        tahunlahir = 2006;
        tempatlahir = "Lhokseumawe";
        umur = 19;
        agama = "Islam";
        jenisKelamin = 'l';
        kampus ="Politeknik Negeri Lhokseumawe";
        jurusan = "Teknologi Informasi dan Komputer";
        prodi = "Teknik Informatika";
        tinggi = 165.5;
        anak = "ke-2";
        statusMahasiswa = true;

        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Tahun Lahir     : " + tahunlahir);
        System.out.println("Tempat Lahir    : " + tempatlahir);
        System.out.println("Umur            : " + umur + " tahun");
        System.out.println("Agama           : " + agama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Kampus          : " + kampus);
        System.out.println("Jurusan         : " + jurusan);
        System.out.println("Program Studi   : " + prodi);
        System.out.println("Tinggi Badan    : " + tinggi + " cm");
        System.out.println("Status Mahasiswa: " + statusMahasiswa);
        System.out.println("Anak Ke-        : " + anak);


    }
}
