package com.nipuna.rentcloud.commons.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {

    @Id
    @GeneratedValue
    private int id;
    private String make;
    private String model;
    private String type;
    private int year;
}
