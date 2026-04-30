package view;

import java.util.ArrayList;

import entity.Categorie;
import entity.Produit;

public final class GestionnaireView {
      private   GestionnaireView (){

      }

      public static void afficheCategorie(ArrayList<Categorie> categories){
         if(categories.isEmpty()){
            System.out.println("Pas de categories disponibles");
        }else{
            for (int index = 0; index < categories.size(); index++) {
              System.out.println(categories.get(index).toString());
           }
        }
       
      }

      public static Categorie selectCategorie(ArrayList<Categorie> categories){
        if(categories.isEmpty()){
           return null;
        }else{
            int indexCat;
            do {
                for (int index = 0; index <  categories.size(); index++) {
                  System.out.println(index+"-"+categories.get(index).getNom());
                } 
                indexCat=saisieNbrePositif("Choisir une categorie: ",0);
            } while (indexCat<0 || indexCat>=categories.size());

            return categories.get(indexCat);
            
        }
       
      }

      public static void afficheProduit(ArrayList<Produit> produits){
        if(produits.isEmpty()){
            System.out.println("Pas de produits disponibles");
        }else{
            for (int index = 0; index < produits.size(); index++) {
              System.out.println(produits.get(index).toString());
           }
        }
       
      }

      

      public static Categorie saisieCategorie(){
        int code =saisieNbrePositif("Entrer le code: ");
        String nom =saisieChaine("Entrer le Nom: ");
        return new Categorie(code,nom);
      }

      public static Produit saisieProduit(ArrayList<Categorie> categories){
         String libelle =saisieChaine("Entrer le Libelle: ");
         double prix =saisieDoublePositif("Entrer le Prix: ");
         int qteStock =saisieNbrePositif("Entrer le Quantite Stock: ");
          Categorie categorie=selectCategorie(categories);
          Produit produit=new Produit(libelle,prix,qteStock);
         //Faire la relation de Produit vers categorie
           produit.setCategorie(categorie);
         //Faire la relation de  Categorie vers  Produit
           categorie.addProduit(produit);
           return produit;
      }


      public static int saisieNbrePositif(String sms){
        int nbre;
        do {
         nbre=Integer.parseInt(System.console().readLine(sms))   ;
        } while (nbre<=0);
        return nbre;
      }

       public static int saisieNbrePositif(String sms,int valMin){
        int nbre;
        do {
         nbre=Integer.parseInt(System.console().readLine(sms))   ;
        } while (nbre<valMin);
        return nbre;
      }


      public static double saisieDoublePositif(String sms){
        double nbre;
        do {
         nbre=Double.parseDouble(System.console().readLine(sms))   ;
        } while (nbre<=0);
        return nbre;
      }

      

      public static String saisieChaine(String sms){
        String chaine;
        do {
         chaine=System.console().readLine(sms)   ;
        } while (chaine.isEmpty());
        return chaine;
      }


}
