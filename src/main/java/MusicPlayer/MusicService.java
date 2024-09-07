package MusicPlayer;

import java.util.List;

public class MusicService {
    Music music;


    public MusicService(Music music) {
        this.music = music;

    }

    void bass() {
        if (music instanceof PremiumMusic) {
            ((PremiumMusic) music).bass();
        } else {
            System.out.println("You don't have that facility");
        }
    }

    void download() {
        if (music instanceof PremiumMusic) {
            ((PremiumMusic) music).download();
        } else {
            System.out.println("You don't have that facility");
        }
    }


}
