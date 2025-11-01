package modul_5.praktikum_1;

public class Person {
    // private-hanya bisa diakses dalam class ini
    private String nama;
    private int umur;

    // default (package-private)- bisa diakses dalam package yang sama
    String alamat;

    //protected - bisa diakses dalam package dan subclass
    protected  String telepon;

    //public -bisa diakses dari mana saja
    public String email;

    //contructor
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }
    public void tampilkanInfo(){
        System.out.println("INFORMASI PERSON");
        System.out.println("Nama    : " + nama);       // ok-dalam class yang sama
        System.out.println("Umur    : " + umur);       // ok-dalam class yang sama
        System.out.println("Alamat  : " + alamat);   // ok-dalam class yang sama
        System.out.println("Telepon : " + telepon); // ok-dalam class yang sama
        System.out.println("Email   : " + email);     // ok-dalam class yang sama
    }
    // Private method - hanya bisa dipanggil dalam class ini
    private void metodePribadi(){
        System.out.println("Ini adalah Metode Private");
    }
    //protected method
    protected void metodeProtected(){
        System.out.println("Ini adalah Metode Protected");
    }
    // method untuk mengakses private method
    protected void panggilMetodePribadi(){
        metodePribadi(); // ok - dala, class yang sama
    }
}
