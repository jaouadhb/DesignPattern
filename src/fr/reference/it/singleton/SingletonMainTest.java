package fr.reference.it.singleton;

public class SingletonMainTest {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getIstance();
        System.out.println(singleton);
        singleton = Singleton.getIstance();
        System.out.println("**********2éme instance************");
        System.out.println(singleton);
    }
}
