package com.nourish1709.homework17.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String model;
    private String manufacturer;
    private String cpu;
    private int memory;
    private boolean used;
    private String material;
    private int price;

    @Temporal(TemporalType.DATE)
    private Date madeOn;

    public Laptop() {
    }

    public Laptop(String model, String manufacturer, String cpu, int memory,
                  boolean used, String material, int price, Date madeOn) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.cpu = cpu;
        this.memory = memory;
        this.used = used;
        this.material = material;
        this.price = price;
        this.madeOn = madeOn;
    }
}