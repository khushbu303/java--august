package oct17;

public class MainMobile {
    public static void main(String[] args) {
        Mobile apple = new Apple();
        Mobile samsung = new Samsung();

        samsung.call();
        samsung.price();
        apple.call();
        apple.price();
        System.out.println(samsung);
        System.out.println(apple);

    }
}
