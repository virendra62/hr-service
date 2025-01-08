package com.hr.service;

import com.hr.entity.Country;

import java.util.List;

public interface CountryService {

    Country saveCountry(Country country);

    List<Country> fetchAllCountries();

    Country getCountryById(Long id);

    Country updateCountryById(Long id, Country country);

    String deleteCountryById(Long id);
}
