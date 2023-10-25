package oct18.interfac.Test;

public class SlowMotionVideo implements Videos{
    @Override
    public void takingVideo() {
        System.out.println("Taking slow-MO");
    }

    @Override
    public void photo() {
        System.out.println("Taking Photos");
    }
}
