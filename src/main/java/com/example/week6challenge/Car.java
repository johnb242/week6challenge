package com.example.week6challenge;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class  Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    @Size(min = 3)
    private String Manufacturer;
    @NotNull
    @Size(min = 3)
    private String Model;

    @NotNull
    @Size(min = 3)
    private String Year;

    @NotNull
    @Min(3)
    private String MSRP;

    @NotNull
    @Min(3)
    private String Category;

    public Car() {
    }

    public Car(@NotNull @Size(min = 3) String manufacturer, @NotNull @Size(min = 3) String model, @NotNull @Size(min = 3) String year, @NotNull @Min(3) String MSRP, @NotNull @Min(3) String category) {
        Manufacturer = manufacturer;
        Model = model;
        Year = year;
        this.MSRP = MSRP;
        Category = category;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        Manufacturer = manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getYear() {
        return Year;
    }

    public void setYear(String year) {
        Year = year;
    }

    public String getMSRP() {
        return MSRP;
    }

    public void setMSRP(String MSRP) {
        this.MSRP = MSRP;
    }

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }
}




