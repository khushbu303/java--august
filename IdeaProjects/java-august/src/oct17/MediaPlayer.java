package oct17;

public abstract class MediaPlayer {
    public String name;
    public int size;

    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract void next();

}
