package com.sts.service;

import com.sts.model.Departement;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class DepartementServiceImpl implements DepartementService{

    List<Departement> departements= new ArrayList<>();
    @Override
    public void save(Departement departement) {
        departements.add(departement);
    }

    @Override
    public List<Departement> getAll() {
        return departements;
    }

    @Override
    public void getbyDepartementCode(String depCode) {

    }

    @Override
    public void update(String departmentCode, String depName) {
        Iterator it= departements.listIterator();
        while (it.hasNext()) {
            Departement dep = (Departement) it.next();
            if (dep.getDepCode().equals(departmentCode)){
                dep.setName(depName);
            };
        }

    }

    @Override
    public void delete(String departmentCode) {
        Iterator it= departements.listIterator();
        while (it.hasNext()) {
            Departement dep = (Departement) it.next();
            if (dep.getDepCode().equals(departmentCode)){
                departements.remove(dep);
            };
        }

    }
}
