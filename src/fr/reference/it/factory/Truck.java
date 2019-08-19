package fr.reference.it.factory;

public class Truck implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is Truck.deliver() méthode");
    }
}
