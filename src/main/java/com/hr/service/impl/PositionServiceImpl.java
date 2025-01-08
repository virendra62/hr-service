package com.hr.service.impl;

import com.hr.entity.Position;
import com.hr.repository.PositionRepository;
import com.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PositionServiceImpl implements PositionService {

    @Autowired
    private PositionRepository positionRepository;

    @Override
    public Position savePosition(Position position) {
        return positionRepository.save(position);
    }

    @Override
    public List<Position> fetchAllPositions() {
        List<Position> allPositions = positionRepository.findAll();
        return allPositions;
    }

    @Override
    public Position getPositionById(Long id) {
        Optional<Position> position = positionRepository.findById(id);
        if (position.isPresent()) {
            return position.get();
        }
        return null;
    }

    @Override
    public Position updatePositionById(Long id, Position position) {
        Optional<Position> position1 = positionRepository.findById(id);

        if(position1.isPresent()) {
        	System.out.println("->>>>>>");
			return positionRepository.save(position);
		}
        return position;
    }

    @Override
    public String deletePositionById(Long id) {
        positionRepository.deleteById(id);
        return ""; //TODO
    }
}
