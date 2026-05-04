package views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import entity.Departement;
import entity.Employe;

public final class UserView {
    private UserView() {
    }

    public static Employe saisirEmploye(ArrayList<Departement> departements) {
        
        String  matricule =saisieChaine("Saisir le matricule de l'employé"); 
        String  nom = saisieChaine("Saisir le nom de l'employé");
        String  prenom = saisieChaine("Saisir le prenom de l'employé");
        String  dateNaissanceStr = saisieChaine("Saisir la date de naissance de l'employé (format: yyyy-mm-dd)");
    
        String   dateEmbaucheStr = saisieChaine("Saisir la date d'embauche de l'employé (format: dd/mm/yyyy)");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dateNaissance = LocalDate.parse(dateNaissanceStr);
        LocalDate dateEmbauche = LocalDate.parse(dateEmbaucheStr, formatter);

        String salaireStr = saisieChaine("Saisir le salaire de l'employé");
        double salaire = Double.parseDouble(salaireStr);
               Employe emp = new Employe(matricule, nom, prenom, dateNaissance, dateEmbauche, salaire);
               char reponse;
                System.out.println("Voulez-vous affecter l'employé à un autre département ? (O/N)");
                reponse = System.console().readLine().toUpperCase().charAt(0);
                if (reponse == 'O') {
                    // Afficher la liste des départements et permettre à l'utilisateur de sélectionner un département
                    Departement departement = selectionnerDepartement(departements);
                    // Relation d'association entre employé et département
                    departement.addEmploye(emp);
                    emp.affecterDepartement(departement);
                    
                }
               return emp;  
    }

    public static String saisieChaine(String message) {
        String input;
        do {
            System.out.println(message);
            input = System.console().readLine();
        } while (input == null || input.trim().isEmpty());
        
        return input;
    }

    public static Departement selectionnerDepartement(ArrayList<Departement> departements) {
        int choice;
        do {
        for(int i=0; i<departements.size(); i++) {
            System.out.println((i ) + "- " + departements.get(i).getName());
        }
        System.out.println("Sélectionner un département en saisissant son numéro :");
        choice = Integer.parseInt(System.console().readLine());
        
    } while (choice < 0 || choice >= departements.size());
        
       
        return departements.get(choice); // Placeholder, à implémenter
    }

  public static void afficherEmployes(ArrayList<Employe> employes) {
   /*
      //Boucle for-each:Utilisée pour parcourir les éléments d'une collection (comme une liste) de manière plus concise et lisible.
        for (Employe emp : employes) {
            System.out.println(emp.toString());
        }
   */

       for (Employe emp : employes) {
            System.out.println(emp.toString());
        }
    }
}
