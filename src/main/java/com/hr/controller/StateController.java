package com.hr.controller;

import com.hr.entity.State;
import com.hr.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class StateController {

    @Autowired
    private StateService StateService;
    
    @PostMapping("/state")
    public State saveState(@RequestBody State State) {
        return StateService.saveState(State);
    }

    @GetMapping("/states")
    public List<State> getAllCountries() {
        return StateService.fetchAllStates();
    }

    @GetMapping("/state/{id}")
    public State getStateById(@PathVariable("id") Long id) {
        return StateService.getStateById(id);
    }

    @PutMapping("/state/{id}")
    public State updateState(@PathVariable("id") Long id, @RequestBody State State) {
        return StateService.updateStateById(id, State);
    }

    @DeleteMapping("/state/{id}")
    public String deleteState(@PathVariable("id") Long id) {
        return StateService.deleteStateById(id);
    }

}
