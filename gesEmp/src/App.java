import java.util.ArrayList;

import entity.Departement;
import entity.Employe;
import services.DepartementService;
import services.EmployeService;
import views.UserView;

public class App {
    public static void main(String[] args) throws Exception {
         DepartementService.initDepartements();
         int choice;
         do {
           
            System.out.println("1- Ajouter un employé");
            System.out.println("2- Affeter un employé à un département");
            System.out.println("3- Afficher  tous les employés");
             System.out.println("4- Afficher  tous les employés d'un département");
            System.out.println("5- Quitter");

            choice = Integer.parseInt(System.console().readLine());
            switch (choice) {
                case 1:
                    //Sequence d'ajout d'un employé
                    //1- Saisir les données de l'employé
                         //a-saisir les données de base (matricule, nom, prenom)
                         //b-saisir les données de date de naissance et date d'embauche
                         //c-saisir le salaire
                         //d-Selectionner le département
                         //e Créer un objet de type employé
                         //f-Retourner l'employé créé
                         ArrayList<Departement> departements = DepartementService.getDepartements();
                         Employe emp = UserView.saisirEmploye(departements);
                       //3- Ajouter l'employé à la liste des employés du service
                         EmployeService.addEmploye(emp);

                    
                    break;
                 case 2:
                        //Séquence d'affectation d'un employé à un département
                        //1- Rechercher l'employé à affecter (par matricule)
                             //a- Saisir le matricule de l'employé à affecter
                             String matricule = UserView.saisieChaine("Saisir le matricule de l'employé à affecter :");
                             //b- Rechercher l'employé dans la liste des employés du service
                              Employe empSearch = EmployeService.findEmployeByMatricule(matricule);
                        //2- Verifier que l'employé existe et qu'il n'est pas déjà affecté à un département
                        if (empSearch == null ) {
                              System.out.println("Employé non trouvé");
                              break;
                        }
                        if (empSearch.getDepartement() != null) {
                              System.out.println("L'employé est déjà affecté à un département");
                              break;
                        }
                        //3- Afficher la liste des départements et permettre à l'utilisateur de sélectionner un département
                        Departement departement = UserView.selectionnerDepartement(DepartementService.getDepartements());

                        //4- Relation d'association entre employé et département
                        departement.addEmploye(empSearch);
                        empSearch.affecterDepartement(departement);
                     
                        
                        break;
                    case 3:
                        UserView.afficherEmployes(EmployeService.getEmployes());
                        break;
                    case 4:
                        //Séquence d'affichage des employés d'un département
                        //1-Selectionner le département
                          Departement departementSelect = UserView.selectionnerDepartement(DepartementService.getDepartements());
                          //2-Recupérer la liste des employés du département sélectionné
                           ArrayList<Employe> employesDepartement = departementSelect.getEmployes();
                         //3-Afficher les employés du département sélectionné
                            UserView.afficherEmployes(employesDepartement);
                        break;
                default:
                    break;
            }
            
        } while (choice != 5);
    }
}
