package com.hr.service;

import com.hr.entity.City;
import com.hr.entity.State;

import java.util.List;

public interface CityService {

    City saveCity(City city);

    List<City> fetchAllCities();

    City getCityById(Long id);

    City updateCityById(Long id, City city);

    String deleteCityById(Long id);
}
