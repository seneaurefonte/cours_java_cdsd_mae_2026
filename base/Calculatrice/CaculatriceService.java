

public final class CaculatriceService {
    
    private CaculatriceService() {
        // Constructeur privé pour empêcher l'instanciation
    }

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double soustraction(double a, double b) {
        return a - b;
    }
    public static double division(double a, double b) {
        if (b!=0) {
             return a / b;
        }
        else {
            System.out.println("Erreur: Division par zéro");
            return Double.NaN; // Retourne NaN pour indiquer une division par zéro
        }
       
    }
}
