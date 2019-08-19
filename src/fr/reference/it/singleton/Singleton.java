package fr.reference.it.singleton;

/*Thread 1 appelle getInstance() et détermine que instance est null en ligne //1
        Thread 1 entre dans le bloc if puis est préempté par le thread 2 avant l'exécution de la ligne //2
        Thread 2 appelle getInstance() et détermine que instance est null en ligne //1
        Thread 2 entre dans le bloc if, crée un nouveau Singleton et assigne ce nouvel objet à la variable instance en ligne //2
        Thread 2 retourne la référence au Singleton en ligne 3
        Thread 2 est préempté par le Thread 1
        Thread 1 reprend où il s'était arrêté et exécute la ligne //2 créant alors une autre instance de Singleton
        Thread 1 retourne cette nouvelle instance en ligne //3*/
public class Singleton {

    private static Singleton INSTANCE = null;

    private Singleton(){}

    public static synchronized  Singleton getIstance()
    {
        if(INSTANCE==null)
        {
            synchronized (Singleton.class)
            {
                INSTANCE = new Singleton();
            }
        }
        return INSTANCE;
    }
}
