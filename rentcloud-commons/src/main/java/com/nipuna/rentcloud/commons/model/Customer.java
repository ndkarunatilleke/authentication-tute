package com.nipuna.rentcloud.commons.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@Data
public class Customer {
    @Id
    @GeneratedValue
    private int id;

    private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipCode;
}
