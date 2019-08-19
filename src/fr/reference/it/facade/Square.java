package fr.reference.it.facade;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("drawing from Square::draw");
    }
}
