package entity;

import java.time.LocalDate;

public class Employe {
    private static int compteur=0;
    private int id;
    private final String matricule;
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;
    private LocalDate dateEmbauche;
    private double salaire;
    private final static  int AGE_RETRAITE=65;

    // Association ManyToOne
    private Departement departement=null;

    public Departement getDepartement() {
        return departement;
    }
    public void affecterDepartement(Departement departement) {
        this.departement = departement;
    }
    public Employe(String matricule) {
        this.id=++compteur;
        this.matricule = matricule;
    }
    public Employe( String matricule, String nom, String prenom, LocalDate dateNaissance, LocalDate dateEmbauche, double salaire) {
         this.id = ++compteur;
         this.matricule = matricule;
         this.nom = nom;
         this.prenom = prenom;
         this.dateNaissance = dateNaissance;     
         this.dateEmbauche = dateEmbauche;
         this.salaire = salaire; 
    }

    public int getId() {
        return id;
    }   
    public String getMatricule() {
        return matricule;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public LocalDate getDateNaissance() {
        return dateNaissance;
    }
    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }
    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }
    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }
    public double getSalaire() {
        return salaire;
    }
    public void setSalaire(double salaire) {
        this.salaire = salaire; 
    }
    @Override
    public String toString() {
        return "Matricule: " + matricule + ", Nom: " + nom + ", Prenom: " + prenom + ", Date de naissance: "
                + dateNaissance + ", Date d'embauche: " + dateEmbauche + ", Salaire: " + salaire ;
    }
    
    public int anneRetraite() {
        return dateNaissance.getYear() + AGE_RETRAITE;
    }

    public int nbreAnneesService() {
        return anneRetraite() - dateEmbauche.getYear();
    }

    public int age() {
        return LocalDate.now().getYear() - dateNaissance.getYear();
    }
    public boolean isRetraite() {
        return LocalDate.now().getYear() >= anneRetraite();
    }

    
    
}
