package fr.reference.it.proxy;

public class ImageServiceImp implements ImageService {
    @Override
    public void displayImage() {
        System.out.println("Display image from real service");
    }
}
