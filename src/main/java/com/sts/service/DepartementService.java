package com.sts.service;

import com.sts.model.Departement;

import java.util.List;

public interface DepartementService {
    void save(Departement departement);
    List<Departement> getAll();
    void getbyDepartementCode(String depCode);
    void update(String depCode, String depName);
    void delete(String depCode);

}
