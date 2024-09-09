package MusicPlayer;

public class PremiumMusicPlayer implements  PremiumMusic,PlayList {
    public void play() {
        System.out.println("Premium music player can play music");
    }

    public void speed(SpeedType speedType) {
        System.out.println("Premium music player can adjust speed" + speedType);
    }

    public void volume() {
        System.out.println("Premium music player can adjust volume");
    }

    public void bass() {
        System.out.println("Premium music player can adjust bass");
    }

    public void download() {
        System.out.println("Premium music player can download");
    }

    @Override
    public void add(Music music) {
        System.out.println("Added to playlist");
    }

    @Override
    public void delete(Music music) {
        System.out.println("Removed from playlist");
    }
}
