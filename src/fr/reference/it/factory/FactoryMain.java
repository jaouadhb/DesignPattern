package fr.reference.it.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Transport transport1 = TransportFactory.getTransport("Ship");
        transport1.deliver();

        transport1 = TransportFactory.getTransport("Truck");
        transport1.deliver();

        transport1 = TransportFactory.getTransport("nothing");
    }
}
