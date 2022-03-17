package com.Vurti.Vurti.service;

import com.Vurti.Vurti.model.Performance;
import com.Vurti.Vurti.repository.PerformanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PerformanceService {
    @Autowired
    private PerformanceRepository repository;

    //ceate
    public Performance saveperfomance(Performance performance){
        return repository.save(performance);
    }

    //read
    public List<Performance> listperformance(){
        return (List<Performance>) repository.findAll();

    }

    //delete
    public String delperformance(Integer id){
        repository.deleteById(id);
        return null;
    }
}
