package fr.reference.it.proxy;

public class ImageServiceProxy implements ImageService {

    ImageService imageService;

    @Override
    public void displayImage() {
        /*
        Add some instruction
         */
        if(imageService==null)
        {
            imageService = new ImageServiceImp();
        }
        imageService.displayImage();
    }
}