package com.buraksahin.carpricecollector.domain.entity;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;

@Data
@Generated
@EqualsAndHashCode(callSuper = true)
@Entity
@SequenceGenerator(name = "idgen", sequenceName = "CAR_SEQ", allocationSize = 1)
@Table(name = "CAR")
public class Car extends CommonTimeEntity{
    private Long id;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "PRICE")
    private String price;
    @Column(name = "KM")
    private String km;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "MODEL_YEAR")
    private String year;
    @Column(name = "LISTING_DATE")
    private String listingDate;
    @Column(name = "LISTING_PROVINCE")
    private String listingProvince;
    @Column(name = "LISTING_DISTINCT")
    private String listingDistinct;
    public Car(String model, String price, String km, String color, String year, String listingDate, String listingProvince, String listingDistinct) {
        this.model = model;
        this.price = price;
        this.km = km;
        this.color = color;
        this.year = year;
        this.listingDate = listingDate;
        this.listingProvince = listingProvince;
        this.listingDistinct = listingDistinct;
    }

    public Car() {
    }
}
