package com.sts.service;

import com.sts.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees=new ArrayList<>();


    @Override
    public void save(Employee employee) {
        employees.add(employee);
    }

    @Override
    public List<Employee> getEmployees() {
        return employees;
    }


    @Override
    public void update(String matricule,String name, String email, Long phoneNumber) {
        Iterator iterator=employees.listIterator();
        while (iterator.hasNext()){
            Employee emp=(Employee) iterator.next();
            if (emp.getMatricule().equals(matricule)){
                emp.setFullName(name);
                emp.setEmail(email);
                emp.setPhoneNumber(phoneNumber);
            }
        }

    }

    /*
    [{"EMP001", "Birahim","+12072073639","Bra@gmail.com"},
    {"EMP002", "Amina","+120483639","amina@gmail.com"}]

    based oon the matricule EMP002 we wanna remove the employee

    1 Iterate
    2 Compare matricule to the value    EMP002
    3 Remove employee with matricule EMP002

     */


    @Override
    public void remove(String matricule) {
        Iterator iterator=employees.listIterator();
        while (iterator.hasNext()) {
            Employee emp = (Employee) iterator.next();
            if (emp.getMatricule().equals(matricule)){
                employees.remove(emp);
            }
        }


    }
}
