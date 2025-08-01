package com.cognizant.spring_learns;

import org.apache.log4j.Logger;

public class Country {
    private String code;
    private String name;

    private static final Logger LOGGER = Logger.getLogger(Country.class);

    public Country() {
        LOGGER.debug("Inside Country Constructor.");
    }

    public String getCode() {
        LOGGER.debug("Inside getCode.");
        return code;
    }

    public void setCode(String code) {
        LOGGER.debug("Inside setCode.");
        this.code = code;
    }

    public String getName() {
        LOGGER.debug("Inside getName.");
        return name;
    }

    public void setName(String name) {
        LOGGER.debug("Inside setName.");
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country [code=" + code + ", name=" + name + "]";
    }
}
