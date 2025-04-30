// import java.util.Scanner;

// public class Personne {
//     private String nom ;
//     private String adresse ;
//     private int age ;
//     // creation d'un constructeur
//     public Personne(String nom,String adresse,int age){
//         this.nom = nom;
//         this.adresse = adresse; 
//         this.age = age; 
//     }
//     public String getNom(){
//         return this.nom;
//     }
//     public String getAdresse(){
//         return this.adresse;
//     }
//     public int getAge(){
//         return this.age;
//     }
//     // creation de setttters 
//     public void setNom(String nom){
//         this.nom = nom ;
//     }
//     // Methode d'afichage
//     public void afficherPersonne(){
//         System.out.println("nom: "+ nom);
//         System.out.println("adresse: "+ adresse);
//         System.out.println("age: "+ age);


//     }
//     public static void main(String[] args) {
//         Personne P = new Personne("ibou","keur massar",12);
//         // System.out.println(P.getNom());
//         P.afficherPersonne();

//         P.setNom("malick");
//         P.afficherPersonne();
//     }
// Methode main 
// public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Entrez le nom : ");
//         String nom = sc.nextLine();

//         System.out.print("Entrez l'adresse : ");
//         String adresse = sc.nextLine();

//         System.out.print("Entrez l'âge : ");
//         int age = sc.nextInt();

//         // Création de l'objet avec les données saisies
//         Personne P = new Personne(nom, adresse, age);

//         // Affichage
//         P.afficherPersonne();
// }
//  }
// MINI PROJET JAVA AVEC MENU :
// On cree un tbleau de Personne puis on a les options suivants: 
// 1.Ajouter Personne
// 2.Lister Personne
// 3.rechercher une Personne
// 4.quitter
import java.util.Scanner;

public class Personne {
    private String nom;
    private String adresse;
    private int age;
    private int telephone;

    // Constructeur
    public Personne(String nom, String adresse, int age, int telephone) {
        this.nom = nom;
        this.adresse = adresse; 
        this.age = age; 
        this.telephone = telephone ;
    }

    // Getters
    public String getNom() {
        return this.nom;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public int getAge() {
        return this.age;
    }
    public int getTelephone() {
        return telephone;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    // Méthode d'affichage
    public void afficherPersonne() {
        System.out.println("Nom: " + nom);
        System.out.println("Adresse: " + adresse);
        System.out.println("Age: " + age);
        System.out.println("Telephone: " + telephone);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Personne[] personnes = new Personne[100]; // Tableau pour stocker les personnes
        int nombrePersonnes = 0; // Compteur de personnes

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ajouter une personne");
            System.out.println("2. Lister toutes les personnes");
            System.out.println("3. rechecher par  telephone");
            System.out.println("4. Quitter");
            System.out.print("Votre choix: ");

            int choix = sc.nextInt();
            sc.nextLine(); // Pour consommer le retour à la ligne

            switch (choix) {
                case 1:
                    if (nombrePersonnes < personnes.length) {
                        System.out.print("\nEntrez le nom : ");
                        String nom = sc.nextLine();

                        System.out.print("Entrez l'adresse : ");
                        String adresse = sc.nextLine();

                        System.out.print("Entrez l'âge : ");
                        int age = sc.nextInt();
                        System.out.print("Entrez le numero de telephone : ");
                        int telephone = sc.nextInt();

                        Personne p = new Personne(nom, adresse, age, telephone);
                        personnes[nombrePersonnes] = p;
                        nombrePersonnes++;
                        System.out.println("\nPersonne ajoutée avec succès!");
                    } else {
                        System.out.println("\nLe tableau est plein, impossible d'ajouter plus de personnes.");
                    }
                    break;

                case 2:
                    System.out.println("\nListe des personnes:");
                    if (nombrePersonnes == 0) {
                        System.out.println("Aucune personne à afficher.");
                    } else {
                        for (int i = 0; i < nombrePersonnes; i++) {
                            personnes[i].afficherPersonne();
                        }
                    }
                    break;
                    case 3:
                    System.out.println("Entrer le numero de tel a rechercher !");
                    int telrecherche = sc.nextInt();
                    boolean trouve = false;
                    for(int i = 0;i < nombrePersonnes; i++){
                        if (personnes[i].getTelephone() == (telrecherche)) {
                            System.out.println("Personne trouvee :");
                            personnes[i].afficherPersonne();
                            trouve = true;
                            break;
                        }
                    }
                    if (!trouve) {
                        System.out.println("Aucune personne trouvee avec ce numero ");
                    }
                    break;

                case 4:
                    System.out.println("Au revoir!");
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }
    }
}