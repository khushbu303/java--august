package oct17;

public class VideoPlayer extends MediaPlayer{
    @Override
    public void play() {
        System.out.println("Netflix");
    }

    @Override
    public void pause() {
        System.out.println("Spotify");

    }
    @Override
    public void stop() {
        System.out.println("VLC");
    }

    @Override
    public void next() {
        System.out.println("youtube");
    }
}
