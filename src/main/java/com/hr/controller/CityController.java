package com.hr.controller;

import com.hr.entity.City;
import com.hr.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class CityController {

    @Autowired
    private CityService cityService;
    
    @PostMapping("/city")
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @GetMapping("/cities")
    public List<City> getAllCountries() {
        return cityService.fetchAllCities();
    }

    @GetMapping("/city/{id}")
    public City getCityById(@PathVariable("id") Long id) {
        return cityService.getCityById(id);
    }

    @PutMapping("/city/{id}")
    public City updateCity(@PathVariable("id") Long id, @RequestBody City city) {
        return cityService.updateCityById(id, city);
    }

    @DeleteMapping("/city/{id}")
    public String deleteCity(@PathVariable("id") Long id) {
        return cityService.deleteCityById(id);
    }

}
