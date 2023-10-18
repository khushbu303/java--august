package oct17;

public abstract class Animal {
    // non abstract method
    public void move(){
        System.out.println("Animal can move");
    }
    // no bidy for abstarct method
    public abstract void makeSound();
}
