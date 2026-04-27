package base.type;
public class HelloWord {
        public static void main(String[] args) {
            //Type Data(Valeur)
             int x = 10;
             short  y = 20;
             long z = 30;
             double a = 40.5;
             float b = 50.5f;
             char c = 'A';
             boolean d = true;
          //Type Data(Reference)
           //Bibliotheque de classe Java
            //1.String
              //Decalartion de l'objets
                String name ;
              //Instanciation de l'objets
              name =new String("Hello Word");
              //NB : String est une classe et non un type de données primitif
              name = "Hello Word";
            //2.Classe System : 
              //La classe System est une classe de la bibliothèque de classe Java
              //  qui fournit des méthodes pour interagir
              //  avec le système d'exploitation et les entrées(Lecture)/sorties(Affichage).
               //System.in : est un objet de la classe InputStream qui représente l'entrée standard (la console).
                 // System.console(): est une méthode de la classe System qui retourne un 
                                    // objet de la classe Console qui représente la console du système.
                //System.console().readLine("Message"): est une méthode de la classe Console qui affiche un message à l'utilisateur 
                                                               // et lit une ligne de texte saisie par l'utilisateur.            
               //System.out : est un objet de la classe PrintStream qui représente la sortie standard (la console).
                        System.out.println("Hello Word");
               //System.err : est un objet de la classe PrintStream qui représente la sortie d'erreur standard (la console).
             //3.Classe Wrapper
               //La classe Wrapper est une classe de la bibliothèque de classe Java qui fournit des méthodes pour convertir les types de données primitifs en objets et vice versa.
               //int x = 10;        ==> Integer x = 10; //Autoboxing
               Integer x1 = 10; //Autoboxing
               int x2 = x1; //Unboxing
               Integer x3 = Integer.valueOf(x2); //Autoboxing
               int x4= Integer.parseInt("123"); //Autoboxing

               //short  y = 20;     ==> Short y = 20; //Autoboxing
               //long z = 30;       ==> Long z = 30; //Autoboxing
               //double a = 40.5;   ==> Double a = 40.5; //Autoboxing
               double d1 = Double.parseDouble("40,5"); //Autoboxing
               //float b = 50.5f;   ==> Float b = 50.5f; //Autoboxing
               float f1 = Float.parseFloat("50,5"); //Autoboxing
               //char c = 'A';      ==>  Character c = 'A'; //Autoboxing
               //boolean d = true;   ==> Boolean d = true; //Autoboxing
        }
    
}
