

public class App {
    public static void main(String[] args) {

       int choix;
        do {
               System.out.println("1- Add Personne");
                System.out.println("2- Lister Personnne");
                System.out.println("3- Lister Personnne de meme nom");
                System.out.println("4- Quitter");
               choix = Integer.parseInt(System.console().readLine("Enter votre choix: "));

            switch (choix) {
                case 1:
                      var pers=PersonneView.saisiePersonne();
                      PersonneService.addPersonne(pers);
                    break;
                case 2:
                    var personnes=PersonneService.getPersonnes();
                    int nbrePers=PersonneService.getNbreElements();
                    PersonneView.affichePersonne(personnes,nbrePers);
                     break;
                case 3:
                       String nom =PersonneView.saisieChaine("Entrer le nom");
                       personnes=PersonneService.getPersonnesByName(nom);
                      int nbrePersByName=PersonneService.getNbrePersonnesSameName();
                       PersonneView.affichePersonne(personnes,nbrePersByName);
                    break;

                case 4:
                        
                    break;
            
                default:
                    System.out.println("Choix invalide!");
                    break;
            }
        } while (choix != 4);
      }
}
