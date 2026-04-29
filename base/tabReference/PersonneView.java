public class PersonneView {
    public static Personne saisiePersonne(){
      String nom=PersonneView.saisieChaine("Entrer le nom");
      String prenom=PersonneView.saisieChaine("Entrer le prenom");
      return new Personne(nom,prenom);
    }

    public static void affichePersonne(Personne[]personnes , int nbrePers){
        for (int index = 0; index < nbrePers; index++) {
            System.out.println(personnes[index].toString());
        }
    }

    public static String saisieChaine(String sms){
        String value;
        do {
            value=System.console().readLine(sms);
        } while (value.isEmpty());

        return value;
    }
}
