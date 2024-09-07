package MusicPlayer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Music music = new SimpleMusicPLayer();
        MusicService musicService = new MusicService(music);
        musicService.bass();
        musicService.download();
        PlayList simplemusicplayerplaylist=new SimpleMusicPLayer();
        simplemusicplayerplaylist.add(music);
        simplemusicplayerplaylist.delete(music);


    }
}
