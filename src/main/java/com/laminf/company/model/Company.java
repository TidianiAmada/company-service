package com.laminf.company.model;

public class Company {
    private String nom;
    private String ninea;
    private String siege;


    public Company() {
    }

    public Company(String nom, String ninea, String siege) {
        this.nom = nom;
        this.ninea = ninea;
        this.siege = siege;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNinea() {
        return ninea;
    }

    public void setNinea(String ninea) {
        this.ninea = ninea;
    }

    public String getSiege() {
        return siege;
    }

    public void setSiege(String siege) {
        this.siege = siege;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nom='" + nom + '\'' +
                ", ninea='" + ninea + '\'' +
                ", siege='" + siege + '\'' +
                '}';
    }
}
