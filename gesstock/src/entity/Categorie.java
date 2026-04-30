package entity;

public class Categorie {
     private int code ;
     private String nom;
     private static final int TAILLE=20;
     //OneToMany
     private  Produit[] produits=new Produit[TAILLE];
     private  int nbreProduit=0;

      public  boolean addProduit(Produit produit){
        if (nbreProduit<TAILLE) {
            produits[nbreProduit]=produit;
             nbreProduit++;
             return true;
        }

        return false;
    }
     public  Produit[] getProduitsByCategorie() {
        return produits;
    }


     public  int getNbreProduitByCategorie() {
        return nbreProduit;
    }


    public Categorie(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }


    public Categorie() {
    }

    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
  
    public String toString() {
        return "Code :" + code + " Nom=" + nom ;
    }
}
