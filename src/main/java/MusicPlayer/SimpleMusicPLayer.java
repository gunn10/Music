package MusicPlayer;

public class SimpleMusicPLayer implements Music,PlayList{

    public void play(){
        System.out.println("Simple music player can play music");
    }
   public void speed(SpeedType speedType){
       System.out.println("Simple music player can adjust speed"+ speedType);
   }
    public void volume(){
        System.out.println("Simple music player can adjust volume");
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
