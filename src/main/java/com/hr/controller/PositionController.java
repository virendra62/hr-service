package com.hr.controller;

import com.hr.entity.Position;
import com.hr.service.PositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class PositionController {

    @Autowired
    private PositionService positionService;
    
    @PostMapping("/position")
    public Position savePosition(@RequestBody Position position) {
        return positionService.savePosition(position);
    }

    @GetMapping("/positions")
    public List<Position> getAllCompanies() {
        return positionService.fetchAllPositions();
    }

    @GetMapping("/position/{id}")
    public Position getPositionById(@PathVariable("id") Long id) {
        return positionService.getPositionById(id);
    }

    @PutMapping("/position/{id}")
    public Position updatePosition(@PathVariable("id") Long id, @RequestBody Position position) {
        return positionService.updatePositionById(id, position);
    }

    @DeleteMapping("/position/{id}")
    public String deletePosition(@PathVariable("id") Long id) {
        return positionService.deletePositionById(id);
    }

}
