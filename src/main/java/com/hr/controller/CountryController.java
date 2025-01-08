package com.hr.controller;

import com.hr.entity.Country;
import com.hr.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = {"http://localhost:3001", "http://localhost:8080"})
public class CountryController {

    @Autowired
    private CountryService countryService;
    
    @PostMapping("/country")
    public Country saveCountry(@RequestBody Country country) {
        return countryService.saveCountry(country);
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.fetchAllCountries();
    }

    @GetMapping("/country/{id}")
    public Country getCountryById(@PathVariable("id") Long id) {
        return countryService.getCountryById(id);
    }

    @PutMapping("/country/{id}")
    public Country updateCountry(@PathVariable("id") Long id, @RequestBody Country country) {
        return countryService.updateCountryById(id, country);
    }

    @DeleteMapping("/country/{id}")
    public String deleteCountry(@PathVariable("id") Long id) {
        return countryService.deleteCountryById(id);
    }

}
