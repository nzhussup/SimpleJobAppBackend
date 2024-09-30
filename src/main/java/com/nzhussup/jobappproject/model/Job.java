package com.nzhussup.jobappproject.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Job {

    private int id;
    private String name;
    private String country;
    private String city;
    private String requirements;


    public Job(String name, String country, String city, String requirements) {
        this(0, name, country, city, requirements);
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
