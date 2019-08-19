package fr.reference.it.facade;

public class ShapreMaker implements IShapeMaker {

    Shape rectangle;
    Shape square;

    ShapreMaker(){
        rectangle = new Rectangle();
        square    = new Square();
    }

    @Override
    public void drawRectangle() {
        rectangle.draw();
    }

    @Override
    public void drawSquare() {
        square.draw();
    }
}
