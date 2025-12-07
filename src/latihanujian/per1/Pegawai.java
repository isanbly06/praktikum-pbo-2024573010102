package latihanujian.per1;

    public class Pegawai {
        // 1. Variabel ini seharusnya dilindungi
        private String nama;
        private int gaji;

        public Pegawai(String nama, int gaji) {
            this.nama = nama;
            this.gaji = gaji;
        }

        public int getGaji() {
            return gaji;
        }
        public String getNama() {
            return nama;
        }

        // Method ini seharusnya digunakan untuk mengambil gaji
        public void setGaji(int gajibaru) {
            if (gajibaru >= 0) {
                this.gaji = gajibaru;
            } else  {
                System.out.println("Gagal: Gaji tidak boleh negatif") ;
            }
        }
    }

