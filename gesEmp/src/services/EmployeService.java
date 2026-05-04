package services;

import java.util.ArrayList;

import entity.Employe;

public final class EmployeService {
    private static ArrayList<Employe> employes = new ArrayList<>();
    private EmployeService() {
    }

    public static void addEmploye(Employe emp) {
        employes.add(emp);
    }

    public static ArrayList<Employe> getEmployes() {
        return employes;
    }

    public static Employe findEmployeByMatricule(String matricule) {
        for (int index = 0; index < employes.size(); index++) {
            Employe emp = employes.get(index);
            if (emp.getMatricule().compareTo(matricule) == 0) {
                return emp;
            }
         }
        return null; // Employé non trouvé
    }
    
}
