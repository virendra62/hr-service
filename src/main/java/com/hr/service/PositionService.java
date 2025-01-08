package com.hr.service;

import com.hr.entity.Position;

import java.util.List;

public interface PositionService {

    Position savePosition(Position position);

    List<Position> fetchAllPositions();

    Position getPositionById(Long id);

    Position updatePositionById(Long id, Position position);

    String deletePositionById(Long id);
}
