package entity;

import java.util.ArrayList;


public class Departement {
    private int code;
    private String name;

    private ArrayList<Employe> employes = new ArrayList<>();
    public void addEmploye(Employe e) {
        employes.add(e);
        e.affecterDepartement(this);
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }


    public Departement() {
    }
    public Departement(int code, String name) {
        this.code = code;
        this.name = name;   
    }
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String toString() {
        return "Code=" + code + ", Name=" + name ;
    }
}
