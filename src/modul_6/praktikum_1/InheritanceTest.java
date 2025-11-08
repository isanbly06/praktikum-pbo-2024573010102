package modul_6.praktikum_1;

public class InheritanceTest {
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, "s12345");

        //memanggil method dari superclass
        student.displayinfo();

        //memanggil method dari subclass
        student.study();

        //memanggil overidden method
        student.greet();

        //polymorphism: student sebagai person
        Person person = new Student("Bob", 22, "s67890");
        person.greet(); // memanggil method yang di override
    }
}
