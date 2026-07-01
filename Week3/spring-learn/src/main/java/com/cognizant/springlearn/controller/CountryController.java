package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.Country;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = 
        LoggerFactory.getLogger(CountryController.class);

    // /country — India details return பண்ணும்
    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("Start");
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        LOGGER.info("End");
        return country;
    }

    // /countries/{code} — Code-based country return பண்ணும்
    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("Start");
        ApplicationContext context = 
            new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);

        // Case-insensitive match பண்ணு
        if (country.getCode().equalsIgnoreCase(code)) {
            LOGGER.info("End");
            return country;
        }
        LOGGER.info("End");
        return null;
    }
}
