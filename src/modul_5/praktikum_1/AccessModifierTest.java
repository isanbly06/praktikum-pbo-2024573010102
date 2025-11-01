package modul_5.praktikum_1;

public class AccessModifierTest {
    public static void main(String[] args) {

        Person person = new Person("Budi Santoso", 25);

        // test akses public
        person.email = "budi@gmail.com"; // ok -public
        System.out.println("Email : " + person.email);

        // test akses Default (dalam package yang sama)
        person.alamat = "Jakarta"; // ok - dalam package yang sama
        System.out.println("Alamat : " + person.alamat);

        // test akses protected (dalam package yang sama)
        person.telepon = "081234567890";// ok -dalam package yang sama
        System.out.println("Telepon : " + person.telepon);

        // test akses private - AKAN ERROR jika Uncoment
        // person.nama = "Andi";        // Error - private
        //person.umur =   30;           // error - private
        //person.metodePribadi();       // error - private

        //mengakses data private melalui public method
        person.tampilkanInfo();

        //mengakses private method melalui public method
        person.panggilMetodePribadi();

        System.out.println("\nDEMONSTRASI ACCESS MODIFIER");
        System.out.println("Public      :Bisa diakses");
        System.out.println("Default     :Bisa diakses (dalam package sama)");
        System.out.println("Protected   :Bisa diakses (dalam package sama)");
        System.out.println("Private     :TIDAK bisa diakses langsung");



    }
}
