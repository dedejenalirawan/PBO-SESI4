package Overriding;

/**
 *
 * @author Dede Jenal Irawan
 */
public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Cat();
        Animal animal2 = new Dog();
        animal1.sound(); // Output: Kucing: Meow Meongggggggg!
        animal2.sound(); // Output: Anjing: Gog Goggg Auuuuuuu!
    }
}
