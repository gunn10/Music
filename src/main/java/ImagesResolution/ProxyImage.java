package ImagesResolution;

public class ProxyImage implements Image{
    RealImage realImage;
    String filename;

    public ProxyImage(String filename) {
        this.filename = filename;
    }

    @Override
    public void displayImage() {
        if(realImage==null){
            realImage=new RealImage(filename);
        }
        else{
            realImage.displayImage();
        }
    }

    public void displayThumbnails() {
        System.out.println("Thumbnails: "+filename);
    }
}
