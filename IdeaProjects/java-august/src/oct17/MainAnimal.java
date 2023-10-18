package oct17;

public class MainAnimal {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        cat.makeSound();
        dog.makeSound();

        System.out.println("Animal");

    }
}
