package com.nzhussup.jobappproject.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Job {

    private int id;
    private String name;
    private String country;
    private String city;
    private String requirements;

    public Job() {
    }

    public Job(String name, String country, String city, String requirements) {
        this(0, name, country, city, requirements);
    }

    public Job(int id, String name, String country, String city, String requirements) {
        this.id = id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.requirements = requirements;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    @Override
    public String toString() {
        return "JobService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", requirements=" + requirements +
                '}';
    }
}
