package oct17.interfac.example;

public class Parrot implements Fly{
    @Override
    public void flying() {
        System.out.println("bird can fly");
    }

    @Override
    public void eat() {
        System.out.println("bird can eat");

    }
}
