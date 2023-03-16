package com.demo;

import java.util.List;

public class Result {
    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public List<Animal> getValues() {
        return values;
    }

    public void setValues(List<Animal> values) {
        this.values = values;
    }

    public Integer year;
    public List<Animal> values;

}
