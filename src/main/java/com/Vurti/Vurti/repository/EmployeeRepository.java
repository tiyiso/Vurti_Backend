package com.Vurti.Vurti.repository;

import com.Vurti.Vurti.model.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    Optional<Employee> findByName(String employee);
}

