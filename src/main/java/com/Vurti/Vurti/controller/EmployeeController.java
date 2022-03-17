package com.Vurti.Vurti.controller;

import com.Vurti.Vurti.model.Employee;
import com.Vurti.Vurti.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    // save employee
    @PostMapping("/addemployee")
    public Employee add(@RequestBody Employee employee){
        return service.saveemployee(employee);
    }
    // list employees
    @GetMapping("/listemplyees")
    public List<Employee> lemployees(){
        return service.listemployees();
    }

    //read profile
    @GetMapping("/profile/{employee}")
    public Optional<Employee> profile(@PathVariable String employee){
        return service.findprofile(employee);
    }
}
