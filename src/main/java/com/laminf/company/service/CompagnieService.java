package com.laminf.company.service;

import com.laminf.company.model.Company;

import java.util.List;

public interface CompagnieService {
    boolean ajouterCompagnie(Company newCompagnie);
    void updateSiege(String ninea, String newSiege);

    List<Company>  listCompagnies();
}
