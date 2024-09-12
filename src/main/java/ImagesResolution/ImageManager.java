package ImagesResolution;

import java.util.ArrayList;
import java.util.List;

public class ImageManager {
    List<Image>images=new ArrayList<>();

    void add(Image image){
        images.add(image);
    }
    void displayThumbnails(){
        images.forEach(image -> {
            if (image instanceof ProxyImage) {
                ((ProxyImage) image).displayThumbnails();
            }
            else{
                System.out.println("No thumbnails to display");
            }
        });

    }
    void fullImage(int index){
       if(images.get(index) instanceof ProxyImage){
           images.get(index).displayImage();
       }
       else{
           System.out.println("Can't display image");
       }
    }
}
