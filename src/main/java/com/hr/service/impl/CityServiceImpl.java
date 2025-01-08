package com.hr.service.impl;

import com.hr.entity.City;
import com.hr.repository.CityRepository;
import com.hr.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city) {
        return cityRepository.save(city);
    }

    @Override
    public List<City> fetchAllCities() {
        List<City> allCities = cityRepository.findAll();
        return allCities;
    }

    @Override
    public City getCityById(Long id) {
        Optional<City> city = cityRepository.findById(id);
        if (city.isPresent()) {
            return city.get();
        }
        return null;
    }

    @Override
    public City updateCityById(Long id, City city) {
        Optional<City> city1 = cityRepository.findById(id);

        if(city1.isPresent()) {
        	System.out.println("->>>>>>");
			return cityRepository.save(city);
		}
        return city;
    }

    @Override
    public String deleteCityById(Long id) {
        cityRepository.deleteById(id);
        return ""; //TODO
    }
}
