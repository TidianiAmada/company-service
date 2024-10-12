package com.laminf.company.service;

import com.laminf.company.model.Company;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component //@Service
public class CompagnieServiceImpl implements CompagnieService{
    List<Company> compagnies = new ArrayList<>();


    @Override
    public boolean ajouterCompagnie(Company newCompagnie){
        return compagnies.add(newCompagnie);
    }


    public List<Company> getCompagnies() {
        return compagnies;
    }

    @Override
    public void updateSiege(String ninea, String newSiege){
        getCompagnies().stream().filter(company -> company.getNinea().equalsIgnoreCase(ninea))
                .forEach(company -> company.setSiege(newSiege));
    }

    @Override
    public List<Company> listCompagnies() {
        return getCompagnies();
    }


}
