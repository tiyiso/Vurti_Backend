package com.Vurti.Vurti.service;

import com.Vurti.Vurti.model.Employee;
import com.Vurti.Vurti.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    //create
    public Employee saveemployee(Employee employee){
        return  repository.save(employee);
    }

    //read
    public List<Employee> listemployees(){
        return (List<Employee>) repository.findAll();
    }

    //read profile
    public Optional<Employee> findprofile(String employee){
        return repository.findByName(employee);
    }
}
