package fr.reference.it.facade;

public class MainFacade {
    public static void main(String[] args) {
        IShapeMaker iShapeMaker = new ShapreMaker();
        iShapeMaker.drawRectangle();
        iShapeMaker.drawSquare();
    }
}
