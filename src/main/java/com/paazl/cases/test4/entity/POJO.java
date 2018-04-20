package com.paazl.cases.test4.entity;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class POJO {

    private String name;
    private String city;
    private String country;
    private Integer number;
    private LocalDate date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return name + ";" + city + ";" + country + ";" + number.toString() + ";" + date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
