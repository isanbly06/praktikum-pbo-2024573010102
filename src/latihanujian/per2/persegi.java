package latihanujian.per2;

// File: Persegi.java
public class persegi extends Bentuk {
    // 3. Konstruktor di kelas anak tidak memanggil konstruktor induk
    public persegi(double sisi) {
            super(sisi);
        }

        // Method ini mengimplementasikan hitungLuas untuk Persegi
        public double hitungLuas() {
            return sisi * sisi;
        }
    }

