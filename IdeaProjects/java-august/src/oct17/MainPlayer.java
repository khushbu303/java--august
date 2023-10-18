package oct17;

public class MainPlayer {
    public static void main(String[] args) {
        MediaPlayer audioplayer = new AudioPlayer();
        MediaPlayer videoplayer = new VideoPlayer();
        audioplayer.play();
        audioplayer.pause();
        audioplayer.next();
        audioplayer.stop();
        videoplayer.play();
        videoplayer.next();
        videoplayer.pause();
        videoplayer.stop();

    }
}
