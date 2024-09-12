package ImagesResolution;

public class Main {
    public static void main(String[] args) {
        Image image1=new ProxyImage("image1");
        Image image2=new ProxyImage("image2");
        Image image3=new ProxyImage("image3");
        ImageManager imageManager=new ImageManager();
        imageManager.add(image1);
        imageManager.add(image2);
        imageManager.add(image3);
        imageManager.displayThumbnails();
        imageManager.fullImage(1);
        imageManager.fullImage(1);
    }
}
