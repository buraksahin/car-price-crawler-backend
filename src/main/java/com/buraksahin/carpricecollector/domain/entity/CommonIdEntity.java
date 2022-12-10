package com.buraksahin.carpricecollector.domain.entity;

import javax.persistence.*;

import lombok.Data;
import lombok.Generated;

@Data
@Generated
@MappedSuperclass
public class CommonIdEntity {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idgen")
    private Long id;
}
