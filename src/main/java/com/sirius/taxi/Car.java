package com.sirius.taxi;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    private Integer id;
    
    private String color;
    @Column(name = "number")
    private String plate;
    
    public Integer getId() {
        return id;
    }
    
    public Car setId(final Integer id) {
        this.id = id;
        return this;
    }
    
    public String getColor() {
        return color;
    }
    
    public Car setColor(final String color) {
        this.color = color;
        return this;
    }
    
    public String getPlate() {
        return plate;
    }
    
    public Car setPlate(final String plate) {
        this.plate = plate;
        return this;
    }
    
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", plate='" + plate + '\'' +
                '}';
    }
}
