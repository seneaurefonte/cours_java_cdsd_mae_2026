

public class App {
    public static void main(String[] args) {
           int choix;
    do {
         System.out.println("1- Addition");
         System.out.println("2- Soustraction");
         System.out.println("3- Division");
         System.out.println("4- Quitter");
         choix = Integer.parseInt(System.console().readLine("Enter votre choix: "));
         if (choix == 4) {
            System.out.println("Au revoir!");
            return;
         }else if (choix >= 1 && choix <=3) {
           String nbre1String = System.console().readLine("Enter le premier nombre: ");
           double nbre1 = Double.parseDouble(nbre1String);
           String nbre2String = System.console().readLine("Enter le deuxième nombre: ");
           double nbre2 = Double.parseDouble(nbre2String);
          double result = 0;
          switch (choix) {
            case 1:
                result = CaculatriceService.addition(nbre1, nbre2);
                System.out.println("La somme de " + nbre1 + " et " + nbre2 + " est: " + result);
                break;
            case 2:
                result = CaculatriceService.soustraction(nbre1, nbre2);
                System.out.println("La différence de " + nbre1 + " et " + nbre2 + " est: " + result);
                break;
            
            case 3:
                result = CaculatriceService.division(nbre1, nbre2);
                if (!Double.isNaN(result)) {
                    System.out.println("Le quotient de " + nbre1 + " et " + nbre2 + " est: " + result);
                }
                break;
           }
        }else {
            System.out.println("Choix invalide, veuillez réessayer.");
         }
    }while (choix!=4);
}
}
