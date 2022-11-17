package com.sts.model;

public class Employee {
    private String matricule;
    private String fullName;
    private Long phoneNumber;
    private String email;
    private String departementCode;

    public Employee() {
    }

    public Employee(String matricule, String fullName, Long phoneNumber, String email) {
        this.matricule = matricule;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public Employee(String matricule, String fullName, Long phoneNumber, String email, String departementCode) {
        this.matricule = matricule;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.departementCode = departementCode;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartementCode() {
        return departementCode;
    }

    public void setDepartementCode(String departementCode) {
        this.departementCode = departementCode;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
