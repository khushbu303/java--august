package oct10.oops;

public class Dell extends Computer{
    private int ssd;

    public Dell(int hdd, int size, String model, int ssd) {
        super( hdd, size, model);
        this.ssd =ssd;
    }
    public void Display(){
        setDisplay();
        System.out.println("ssd: " + ssd);
    }

}
