package com.clean.crud.api.response;

import lombok.Data;

public class AddresResponse {

    private String stree;
    private String city;
    private String country;

    public AddresResponse(){}

    public AddresResponse(String stree, String city, String country) {
        this.stree = stree;
        this.city = city;
        this.country = country;
    }

    public String getStree() {
        return stree;
    }

    public void setStree(String stree) {
        this.stree = stree;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
