package services;

import java.util.ArrayList;

import entity.Departement;

public final class DepartementService {
    private static ArrayList<Departement> departements = new ArrayList<>();
    private DepartementService() {
    }
   public static void initDepartements() {
        departements.add(new Departement(1, "Informatique"));
        departements.add(new Departement(2, "Ressources Humaines"));
        departements.add(new Departement(3, "Comptabilité"));
    }
    public static ArrayList<Departement> getDepartements() {
        return departements;
    }

}
