package service;

import entity.Categorie;

public final class CategorieService {
    private static final int TAILLE=20;
    private static Categorie[] categories=new Categorie[TAILLE];
    private static int nbreCategorie=0;
    private CategorieService() {
    }


    public static boolean addCategorie(Categorie categorie){
        if (nbreCategorie<TAILLE) {
            categories[nbreCategorie]=categorie;
             nbreCategorie++;
             return true;
        }

        return false;
    }
     public static Categorie[] getAllCategories() {
        return categories;
    }


     public static int getNbreCategorie() {
        return nbreCategorie;
    }

    public static Categorie getCategorieByNom(String nom){
            for (int index = 0; index < nbreCategorie; index++) {
                if (categories[index].getNom().equals(nom)) {
                     return categories[index];
                }
            }
           return null;
       
      }

    




}
