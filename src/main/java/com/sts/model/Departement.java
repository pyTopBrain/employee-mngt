package com.sts.model;

import java.util.List;

public class Departement {
    private String depCode;
    private String name;

    private List<String> employeeMatricules;

    public Departement() {
    }

    public Departement(String depCode, String name) {
        this.depCode = depCode;
        this.name = name;
    }

    public Departement(String depCode, String name, List<String> employeeMatricules) {
        this.depCode = depCode;
        this.name = name;
        this.employeeMatricules = employeeMatricules;
    }

    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEmployeeMatricules() {
        return employeeMatricules;
    }

    public void setEmployeeMatricules(List<String> employeeMatricules) {
        this.employeeMatricules = employeeMatricules;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
