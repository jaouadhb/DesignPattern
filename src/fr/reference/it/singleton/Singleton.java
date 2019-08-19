package fr.reference.it.singleton;

public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton(){}

    public static Singleton getIstance()
    {
        if(INSTANCE==null)
        {
            INSTANCE = new Singleton();
        }
        return INSTANCE;
    }
}
