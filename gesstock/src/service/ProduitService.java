package service;


import entity.Produit;

public final class ProduitService {
    private static final int TAILLE=20;
    private static Produit[] produits=new Produit[TAILLE];
    private static int nbreProduit=0;
    private ProduitService() {
    }


    public static boolean addProduit(Produit produit){
        if (nbreProduit<TAILLE) {
            produits[nbreProduit]=produit;
             nbreProduit++;
             return true;
        }

        return false;
    }
     public static Produit[] getAllProduits() {
        return produits;
    }


     public static int getNbreProduit() {
        return nbreProduit;
    }

    




}
