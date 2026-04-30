package entity;

import java.util.ArrayList;

public class Categorie {
     private int code ;
     private String nom;
     //OneToMany
    private static ArrayList<Produit> produits=new ArrayList<Produit>();
      public  boolean addProduit(Produit produit){
         produits.add(produit);

        return true;
    }
     public  ArrayList<Produit>getProduitsByCategorie() {
        return produits;
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
