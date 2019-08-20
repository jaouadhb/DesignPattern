package fr.reference.it.proxy;

public class ProxyMain {
    public static void main(String[] args) {
        ImageService imageService = new ImageServiceProxy();
        imageService.displayImage();
    }
}
