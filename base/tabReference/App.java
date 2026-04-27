

public class App {
    public static void main(String[] args) {

      /*
       
          1-Add un tableau de Personne
          2-Lister les personnes du tableau
          3-Lister les personnes ayant le meme nom
          4-Quitter

          RG
            -entity Personne.java
            -service PersonneService.java
            -view PersonneView.java
            -application App.java
      */
                       Personne [] tableauPersonnes;
                         tableauPersonnes = new Personne[3]; 
                         var pers = new Personne("Doe", "John");
                         tableauPersonnes[0] = pers;  
                         tableauPersonnes[1] = new Personne("Smith", "Jane");  
         
                        for (int i = 0; i < 2; i++) {
                            //Affiche l'adresse de la zone de référence (4F5, 4F6) et non les valeurs (Doe, John) et (Smith, Jane)
                              System.out.println(tableauPersonnes[i]);
                             // System.out.println(tableauPersonnes[i].toString());
                             // System.out.println(tableauPersonnes[i].getNom() + " " + tableauPersonnes[i].getPrenom());
                        } 
    }
}
