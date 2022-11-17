package com.sts.service;

import com.sts.model.Employee;

import java.util.List;

public interface EmployeeService {

    // C
    void save(Employee employee);

    // R
    // default helps Avoid mandatory implementation of abstract method
    List<Employee> getEmployees();

    // U
    void update(String matricule, String fullname, String email, Long phoneNumber);
    // D
    void remove(String matricule);

    /* Create  ( insert, create, save, post)
        Read  (read, retrieve, select, get, find)
        Update (update, modify, put)
        Delete (delete, remove)

     */
}
