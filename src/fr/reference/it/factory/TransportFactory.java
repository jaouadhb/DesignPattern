package fr.reference.it.factory;

public class TransportFactory {

    public static Transport getTransport(String pTypeTransport)
    {
        Transport transport=null;

        if(pTypeTransport.equalsIgnoreCase("Truck"))
        {
            transport = new Truck();
        }
        else if(pTypeTransport.equalsIgnoreCase("Ship"))
        {
            transport = new Ship();
        }
        else
            throw new RuntimeException("Unknowen transportation type");

        return  transport;
    }

}
