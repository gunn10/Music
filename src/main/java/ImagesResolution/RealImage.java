package ImagesResolution;

public class RealImage implements Image{
     String filename;

    public RealImage(String filename) {
        this.filename = filename;
        loadFromDisk(filename);
    }

    void loadFromDisk(String filename){
        System.out.println("Full image loaded from disk " + filename);
    }
    @Override
    public void displayImage() {
        System.out.println("Image displayed "+ filename);
    }


}
