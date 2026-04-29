public class PersonneService {
     private static  final int TAILLE = 10;
      private static Personne[] personnes=new Personne[TAILLE];
      private static int nbreElements = 0;

      public static boolean addPersonne(Personne value) {
        if (PersonneService.nbreElements < TAILLE) {
            PersonneService.personnes[PersonneService.nbreElements] = value;
            PersonneService.nbreElements++;
            return true;
        }
        return false;
     }

      public static int getNbreElements() {
        return PersonneService.nbreElements;
     }

    public  static Personne[] getPersonnes() {
      return PersonneService.personnes; 
    }

      private static Personne[] personnesSameName=new Personne[TAILLE];
      public static Personne[] getPersonnesSameName() {
        return personnesSameName;
    }
       private static int nbrePersonnesSameName=0;
      public static int getNbrePersonnesSameName() {
        return nbrePersonnesSameName;
    }

      public  static Personne[] getPersonnesByName(String name) {
        for (int index = 0; index < PersonneService.nbreElements ; index++) {
             if (PersonneService.personnes[index].getNom().equals(name)) {
                  PersonneService.personnesSameName[PersonneService.nbrePersonnesSameName]=PersonneService.personnes[index];
                  PersonneService.nbrePersonnesSameName++;
             }
        }
         return    PersonneService.personnesSameName; 
    }
}
