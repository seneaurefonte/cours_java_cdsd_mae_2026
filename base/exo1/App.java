public class App {
    public static void main(String[] args) {
        String name = System.console().readLine("Enter le Nom: ");
         System.out.println("Hello, " + name + "!");

        //Somme  d'un entier et d'un double
            String nbreString= System.console().readLine("Enter l'entier: ");
            int nbreInt = Integer.parseInt(nbreString);
            String nbreDoubleString= System.console().readLine("Enter le double: ");
            double nbreDouble = Double.parseDouble(nbreDoubleString);
            double somme = nbreInt + nbreDouble;
            System.out.println("La somme de " + nbreInt + " et " + nbreDouble + " est: " + somme);
    }
}
