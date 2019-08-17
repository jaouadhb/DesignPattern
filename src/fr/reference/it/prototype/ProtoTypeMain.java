package fr.reference.it.prototype;

public class ProtoTypeMain {
    public static void main(String[] args) {
        Personne existing = new Personne(1,"Jaouad","HBA","Oujda Maroc");

        Personne copy = existing.clone();

        System.out.println("*********** Existing ************");
        System.out.println(existing.toString());
        System.out.println("********** Copy ***********");
        System.out.println(copy.toString());
        System.out.println("\nEquals personnePrinci et personneClonable : "+existing.equals(copy));
    }
}
