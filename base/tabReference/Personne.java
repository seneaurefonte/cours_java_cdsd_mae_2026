


/*
                                   Reference.                Valeurs
  String nom1;                     nom1==>|  |.               4F6
    nom1=new String("Wane");       nom1==>|4F6|              |Wane|
                                                              4F7
  String nom2=new String("Wane");  nom2==>|4F7|              |Wane|
    nom1==nom2                       ==> 4F6==4F7   ==> Faux
    nom1.equals(nom2)               "Wane"=="Wane"  ==True
*/
public class Personne {
   private String nom;
   private String prenom; 

   
   public Personne(String nom, String prenom) {
    this.nom = nom;
    this.prenom = prenom;
   }

   public Personne() {
   
   }

   public String getNom() {
    return this.nom;
  }

   public void setNom(String nom) {
    this.nom = nom;
}

    public String getPrenom() {
     return this.prenom;
    }
    
    public void setPrenom(String prenom) {
     this.prenom = prenom;
    }

   public String toString() {
        return "Nom='" + this.nom  +", Prenom=" + this.prenom ;
    }
   

}
