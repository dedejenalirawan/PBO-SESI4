package Overriding;

/**
 *
 * @author Dede Jenal Irawan
 */
public class Animal {
    public void sound() {
        System.out.println("Hewan membuat suara.");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Kucing: Meow Meongggggggg!");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Anjing: Gog Goggg Auuuuuuu!");
    }
}
