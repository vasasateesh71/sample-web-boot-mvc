package com.svasa.boot.mvc.samplewebbootmvc.controllers;

import java.util.Optional;

import javax.websocket.server.PathParam;

import com.svasa.boot.mvc.samplewebbootmvc.model.Country;
import com.svasa.boot.mvc.samplewebbootmvc.repositories.CountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.domain.PageRequest;


@Controller
public class CountryController {

    @Autowired
    private CountryRepository countryRepo; 

    @GetMapping("/")
    public String showPage(Model model, int page) {
        model.addAttribute("data", countryRepo.findAll(PageRequest.of(page, 2)));
        return "index";
    }

    @PostMapping("/save")
    public String save(Country country) {
        countryRepo.save(country);
        return "redirect:/";
    }

    @PostMapping("/delete")
    public String save(Long id) {
        countryRepo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne/{id}")
    @ResponseBody
    public Country findOne(@PathVariable("id") Long id) {
        Optional<Country> countryOptional =  countryRepo.findById(id);
        if (countryOptional.isPresent()) {
            return countryOptional.get();
        }
        return null;
    }
}
