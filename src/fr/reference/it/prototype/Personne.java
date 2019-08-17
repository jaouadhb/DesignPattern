package fr.reference.it.prototype;

public class Personne {
    private Integer id;
    private String firstName;
    private String lastName;
    private String adresse;

    public Personne() {
    }

    public Personne(Integer id, String firstName, String lastName, String adresse) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.adresse = adresse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    protected Personne clone()  {
        return new Personne(this.id,this.firstName,this.lastName,this.adresse);
    }

    @Override
    public String toString() {
        return String.format("Les informations de %s %s avec l'id %d à %s",this.firstName,this.lastName,this.id,this.adresse);
    }
}
