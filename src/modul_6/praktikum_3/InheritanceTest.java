package modul_6.praktikum_3;

public class InheritanceTest {
    public static void main(String[] args) {
        //Multilevel inheritance test

        Dog dog = new Dog("Buddy", "Brown", "Golden Retriever");
        dog.eat();
        dog.sleep();
        dog.giveBirth();
        dog.bark();

        System.out.println();

        //Hierarchical Inheritance test

        Cat cat = new Cat("Whisker", "White", true);
        cat.eat();
        cat.sleep();
        cat.giveBirth();
        cat.meow();

        System.out.println();

        //Polymorphism dengan hierarchical inheritance
        Animal[] animals = {new Dog("max", "Black" , "Labrador"),
                           new Cat("Luna", "Gray", false)};

        for (Animal animal : animals) {
            animal.eat(); // akan memanggil method yang sesuai dengan objek sebenarnya
        }

    }
}
