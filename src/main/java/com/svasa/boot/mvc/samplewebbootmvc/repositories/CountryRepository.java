package com.svasa.boot.mvc.samplewebbootmvc.repositories;

import com.svasa.boot.mvc.samplewebbootmvc.model.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
