package com.hr.service.impl;

import com.hr.entity.Country;
import com.hr.repository.CountryRepository;
import com.hr.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Override
    public Country saveCountry(Country country) {
        return countryRepository.save(country);
    }

    @Override
    public List<Country> fetchAllCountries() {
        List<Country> allCountries = countryRepository.findAll();
        return allCountries;
    }

    @Override
    public Country getCountryById(Long id) {
        Optional<Country> country = countryRepository.findById(id);
        if (country.isPresent()) {
            return country.get();
        }
        return null;
    }

    @Override
    public Country updateCountryById(Long id, Country country) {
        Optional<Country> country1 = countryRepository.findById(id);

        if(country1.isPresent()) {
        	System.out.println("->>>>>>");
			return countryRepository.save(country);
		}
        return country;
    }

    @Override
    public String deleteCountryById(Long id) {
        countryRepository.deleteById(id);
        return ""; //TODO
    }
}
