package latihanujian.per2;

public abstract class  Bentuk {
    public double sisi;

    public Bentuk(double sisi) {
        this.sisi = sisi;
    }

    // 2. Method ini seharusnya dideklarasikan abstrak
    public abstract double hitungLuas();

    public void tampilkanInformasi() {
        System.out.println("Ini adalah objek bentuk dengan sisi." + sisi);
    }
}


