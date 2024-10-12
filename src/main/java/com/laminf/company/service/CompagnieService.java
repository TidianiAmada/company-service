package com.laminf.company.service;

import com.laminf.company.model.Company;

import java.util.ArrayList;
import java.util.List;

public class CompagnieService {
    List<Company> compagnies = new ArrayList<>();


    public boolean ajouterCompagnie(Company newCompagnie){
        return compagnies.add(newCompagnie);
    }


    public List<Company> getCompagnies() {
        return compagnies;
    }


}
