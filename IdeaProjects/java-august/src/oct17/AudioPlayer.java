package oct17;

public class AudioPlayer extends MediaPlayer{

    public void songs() {
        System.out.println("Barbie");
    }
    @Override
    public void play() {
        System.out.println("playing song");
    }
    @Override
    public void pause() {
      System.out.println("pause playing song");
    }
    @Override
    public void stop() {
  System.out.println("stop playing song");
    }
    @Override
    public void next() {
        System.out.println("change song");
    }
}
