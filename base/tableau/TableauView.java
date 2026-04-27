

public  final class TableauView {

    private TableauView() {
        // Constructeur privé pour empêcher l'instanciation
    }
    
    public static void afficherTableauInt(int [] tableauInt, int nbreElements) {
        System.out.println("Tableau d'entiers:");
        for (int i = 0; i < nbreElements; i++) {
            System.out.print(tableauInt[i] + " ");
        }
        System.out.println();
    }

    public static int saisirElement() {
                String elementString;
        do {
             elementString = System.console().readLine("Enter un entier à ajouter au tableau: ");
        } while (elementString.isEmpty());
        
        return Integer.parseInt(elementString);
    }
}
