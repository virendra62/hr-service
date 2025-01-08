package com.hr.service;

import com.hr.entity.Country;
import com.hr.entity.State;

import java.util.List;

public interface StateService {

    State saveState(State state);

    List<State> fetchAllStates();

    State getStateById(Long id);

    State updateStateById(Long id, State state);

    String deleteStateById(Long id);
}
