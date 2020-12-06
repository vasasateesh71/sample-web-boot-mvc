package com.svasa.boot.mvc.samplewebbootmvc;

import com.svasa.boot.mvc.samplewebbootmvc.model.Country;
import com.svasa.boot.mvc.samplewebbootmvc.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SampleWebBootMvcApplication implements CommandLineRunner {

	@Autowired
	private CountryRepository countryRepo;

	public static void main(String[] args) {
		SpringApplication.run(SampleWebBootMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		countryRepo.save(new Country("India", "Delhi"));
		countryRepo.save(new Country("South Africa", "Cape Town"));
		countryRepo.save(new Country("Japan", "Tokyo"));
		countryRepo.save(new Country("Bangladesh", "Dakha"));
		countryRepo.save(new Country("Pakistan", "Islamabad"));
		countryRepo.save(new Country("Germany", "Burlin"));
		countryRepo.save(new Country("France", "paris"));
	}
}
