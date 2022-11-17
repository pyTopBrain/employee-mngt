package com.sts.controller;


import com.sts.model.Employee;
import com.sts.service.EmployeeService;
import com.sts.service.EmployeeServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    //tighly coupled
    EmployeeService service=new EmployeeServiceImpl();


    /// @PostMapping @GetMapping @PutMapping @DeleteMapping
 /* Create  ( insert, create, save, post)
        Read  (read, retrieve, select, get, find)
        Update (update, modify, put)
        Delete (delete, remove)

     */

    /// url : localhost:8080/employees/saving
    @PostMapping("/saving")
    public void saveEmployee(@RequestBody Employee employee){
        service.save(employee);
    }

    // localhost:8080/employees/reading
    @GetMapping("/reading")
    //@RequestMapping(method = RequestMethod.GET)
    public List<Employee> retrieveEmployees(){
        return service.getEmployees();
    }

    @PutMapping("/updating")
    public void updateEmployee(@RequestParam String matricule,@RequestParam String fullname,@RequestParam String email,@RequestParam Long phonenumber){
        service.update(matricule,fullname,email,phonenumber);
    }
    // mapping for Delete operation
    @DeleteMapping("/remove")
    public void deleteEmployee(@RequestParam String matricule){
        service.remove(matricule);
    }


}
