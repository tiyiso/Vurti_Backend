package com.Vurti.Vurti.controller;

import com.Vurti.Vurti.model.Performance;
import com.Vurti.Vurti.service.PerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PerformanceController {
    @Autowired
    private PerformanceService service;

    @PostMapping("/addperformance")
    public Performance addperformance(@RequestBody Performance performance){
        return service.saveperfomance(performance);
    }

    @GetMapping("/listperformance")
    public List<Performance> lperformance(){
        return service.listperformance();
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.GET)
    public String delete(@PathVariable("id") int id) {
        return service.delperformance(id);
    }

}
