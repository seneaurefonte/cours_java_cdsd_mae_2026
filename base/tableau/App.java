

public class App {
    public static void main(String[] args) {
        int choix;
        do {
               System.out.println("1- Saisir un entier à ajouter au tableau");
                System.out.println("2- Afficher le tableau d'entiers");
                System.out.println("3- Afficher les valeurs paires du tableau d'entiers");
                System.out.println("4- Trier le tableau d'entiers");
                System.out.println("5- Transfert des elements  paires  dans un nouveau tableau sans doublons");
               System.out.println("6- Quitter");
            choix = Integer.parseInt(System.console().readLine("Enter votre choix: "));

            switch (choix) {
                case 1:
                    int element = TableauView.saisirElement();
                    TableauService.addElement(element);
                    break;
                case 2:
                   var tableauInt = TableauService.getTableauInt();
                   int nbreElements = TableauService.getNbreElements();
                    TableauView.afficherTableauInt(tableauInt, nbreElements);
                    break;
                case 3:
                    System.out.println("Au revoir!");
                    break;
            
                default:
                    System.out.println("Choix invalide!");
                    break;
            }
        } while (choix != 3);
    }
}
