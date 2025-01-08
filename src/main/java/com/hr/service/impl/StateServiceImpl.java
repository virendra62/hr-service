package com.hr.service.impl;

import com.hr.entity.State;
import com.hr.repository.StateRepository;
import com.hr.service.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StateServiceImpl implements StateService {

    @Autowired
    private StateRepository stateRepository;

    @Override
    public State saveState(State state) {
        return stateRepository.save(state);
    }

    @Override
    public List<State> fetchAllStates() {
        List<State> allStates = stateRepository.findAll();
        return allStates;
    }

    @Override
    public State getStateById(Long id) {
        Optional<State> state = stateRepository.findById(id);
        if (state.isPresent()) {
            return state.get();
        }
        return null;
    }

    @Override
    public State updateStateById(Long id, State state) {
        Optional<State> state1 = stateRepository.findById(id);

        if(state1.isPresent()) {
        	System.out.println("->>>>>>");
			return stateRepository.save(state);
		}
        return state;
    }

    @Override
    public String deleteStateById(Long id) {
        stateRepository.deleteById(id);
        return ""; //TODO
    }
}
