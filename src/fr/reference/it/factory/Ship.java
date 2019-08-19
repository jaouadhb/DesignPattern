package fr.reference.it.factory;

public class Ship implements Transport{

    @Override
    public void deliver() {
        System.out.println("This is Ship.deliver() méthode");
    }
}
