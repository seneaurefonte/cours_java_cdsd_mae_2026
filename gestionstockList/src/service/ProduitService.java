package service;


import java.util.ArrayList;

import entity.Produit;

public final class ProduitService {
    private static ArrayList<Produit> produits=new ArrayList<Produit>();
    private ProduitService() {
    }

    public static boolean addProduit(Produit produit){
          produits.add(produit);
        return true;
    }
     public static ArrayList<Produit> getAllProduits() {
        return produits;
    }

}
