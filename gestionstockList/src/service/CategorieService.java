package service;

import java.util.ArrayList;

import entity.Categorie;

public final class CategorieService {
   
    private static ArrayList<Categorie> categories=new ArrayList<Categorie>();
    private CategorieService() {
    }

    public static boolean addCategorie(Categorie categorie){
        categories.add(categorie);
        return true;
    }
     public static ArrayList<Categorie> getAllCategories() {
        return categories;
    }
    public static Categorie getCategorieByNom(String nom){
            for (int index = 0; index < categories.size(); index++) {
                if (categories.get(index).getNom().equals(nom)) {
                     return categories.get(index);
                }
            }
           return null;
       
      }

    




}
