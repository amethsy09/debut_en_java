public class Personne {
    private String nom ;
    private String adresse ;
    private int age ;
    // creation d'un constructeur
    public Personne(String nom,String adresse,int age){
        this.nom = nom;
        this.adresse = adresse; 
        this.age = age; 
    }
    public String getNom(){
        return this.nom;
    }
    public String getAdresse(){
        return this.adresse;
    }
    public int getAge(){
        return this.age;
    }
    // creation de setttters 
    public void setNom(String nom){
        this.nom = nom ;
    }
    public void afficherPersonne(){
        System.out.println("nom: "+ nom);
        System.out.println("adresse: "+ adresse);
        System.out.println("age: "+ age);


    }
    public static void main(String[] args) {
        Personne P = new Personne("ibou","keur massar",12);
        // System.out.println(P.getNom());
        P.afficherPersonne();

        P.setNom("malick");
        P.afficherPersonne();
    }
}
