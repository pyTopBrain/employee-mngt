package com.sts.controller;

import com.sts.model.Departement;
import com.sts.service.DepartementService;
import com.sts.service.DepartementServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartementController {


    // Spring Boot feature
    // Dependency/ Bean injection Spring IoC
    // loosely coupled
    @Autowired
   DepartementService departementService;




    @PostMapping
    public void saveDepartment(@RequestBody  Departement departement){
        departementService.save(departement);
    }
    @GetMapping
    public List<Departement> getDepartements(){
        return departementService.getAll();
    }



}
