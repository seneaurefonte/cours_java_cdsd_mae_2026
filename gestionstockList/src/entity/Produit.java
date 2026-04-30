package entity;

public class Produit {
     private static int compteur=0;
     private int code ;
     private String libelle;
     private double prix;
     private int qteStock;


    //Relations ManyToOne
     private  Categorie categorie;



     public Categorie getCategorie() {
        return categorie;
    }



     public void setCategorie(Categorie categorie) {
         this.categorie = categorie;
     }



     public Produit(String libelle, double prix, int qteStock) {
        this.code=++compteur;
        this.libelle = libelle;
        this.prix = prix;
        this.qteStock = qteStock;
    }



     public Produit() {
          this.code=++compteur;
    }



     public int getCode() {
        return code;
    }



     public void setCode(int code) {
         this.code = code;
     }



     public String getLibelle() {
         return libelle;
     }



     public void setLibelle(String libelle) {
         this.libelle = libelle;
     }



     public double getPrix() {
         return prix;
     }



     public void setPrix(double prix) {
         this.prix = prix;
     }



     public int getQteStock() {
         return qteStock;
     }



     public void setQteStock(int qteStock) {
         this.qteStock = qteStock;
     }



     public double getMontant(){
        return prix*qteStock;
     }



   
     public String toString() {
        return "Code: " + code + ", Libelle: " + libelle 
               + ", Prix: " + prix + ", QteStock: " 
               + qteStock + ", MntStock: " + getMontant()
               + ", Categorie: " + categorie.getNom();
     }
}
