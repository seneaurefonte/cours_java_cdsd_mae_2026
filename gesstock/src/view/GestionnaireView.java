package view;

import entity.Categorie;
import entity.Produit;

public final class GestionnaireView {
      private   GestionnaireView (){

      }

      public static void afficheCategorie(Categorie[] categories,int nbreCategorie){
        if(nbreCategorie==0){
            System.out.println("Pas de categories disponibles");
        }else{
            for (int index = 0; index < nbreCategorie; index++) {
              System.out.println(categories[index].toString());
           }
        }
       
      }

      public static Categorie selectCategorie(Categorie[] categories,int nbreCategorie){
        if(nbreCategorie==0){
           return null;
        }else{
            int indexCat;
            do {
                for (int index = 0; index < nbreCategorie; index++) {
                  System.out.println(index+"-"+categories[index].getNom());
                } 
                indexCat=saisieNbrePositif("Choisir une categorie: ",0);
            } while (indexCat<0 || indexCat>=nbreCategorie);

            return categories[indexCat];
            
        }
       
      }

      public static void afficheProduit(Produit[] produits,int nbreProduit){
        if(nbreProduit==0){
            System.out.println("Pas de categories disponibles");
        }else{
            for (int index = 0; index < nbreProduit; index++) {
              System.out.println(produits[index].toString());
           }
        }
       
      }

      

      public static Categorie saisieCategorie(){
        int code =saisieNbrePositif("Entrer le code: ");
        String nom =saisieChaine("Entrer le Nom: ");
        return new Categorie(code,nom);
      }

      public static Produit saisieProduit(Categorie[] categories,int nbreCategorie){
         String libelle =saisieChaine("Entrer le Libelle: ");
         double prix =saisieDoublePositif("Entrer le Prix: ");
         int qteStock =saisieNbrePositif("Entrer le Quantite Stock: ");
          Categorie categorie=selectCategorie(categories, nbreCategorie);
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
