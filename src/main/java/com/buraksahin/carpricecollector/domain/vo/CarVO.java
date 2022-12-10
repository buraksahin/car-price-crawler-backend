package com.buraksahin.carpricecollector.domain.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class CarVO implements Serializable {
    @JsonProperty("model")
    private String model;
    @JsonProperty("year")
    private String year;
    @JsonProperty("km")
    private String km;
    @JsonProperty("color")
    private String color;
    @JsonProperty("price")
    private String price;
    @JsonProperty("listing_date")
    private String listingDate;
    @JsonProperty("listing_province")
    private String listingProvince;
    @JsonProperty("listing_distinct")
    private String listingDistinct;
}
