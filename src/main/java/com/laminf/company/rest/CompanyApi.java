package com.laminf.company.rest;

import com.laminf.company.model.Company;
import com.laminf.company.service.CompagnieService;
import com.laminf.company.service.CompagnieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class CompanyApi {

    // TODO @PostMapping, @PutMapping, @DeleteMapping, @Service, @Component, Injection
    // TODO Revenir sur les concepts de Spring IoC, Dependency Injection

    // TODO StateLess ----- Statefull (DB)

    @Autowired // Deleguer à Spring l'injection de ce composant
    CompagnieService service;

    // TODO @RequestBody, @RequestHeader, @RequestParam
    @PostMapping
    public boolean ajouterCompagnie(@RequestBody Company newCompagnie){
        System.out.println(" New companiy to add  "+newCompagnie.toString());
        return service.ajouterCompagnie(newCompagnie);
    }

    @PutMapping("/loop")
    public void modifierCompagny(@RequestParam String ninea, @RequestParam String newSiege){
        List<Company> compagnies = service.listCompagnies();
        for (Company comp:compagnies) {
            if (comp.getNinea().equalsIgnoreCase(ninea)){
                comp.setSiege(newSiege);
            }
        }
    }
    @PutMapping("/stream")
    public void updateCompany(@RequestParam String ninea, @RequestParam String newSiege){
        service.updateSiege(ninea,newSiege);
    }

    @GetMapping
    public List<Company> companyList(){
        return service.listCompagnies();
    }


}
