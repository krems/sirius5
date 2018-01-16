package com.sirius.taxi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    private int id;
    private String name;
    private double rating;
    
    public int getId() {
        return id;
    }
    
    public Client setId(final int id) {
        this.id = id;
        return this;
    }
    
    public double getRating() {
        return rating;
    }
    
    public Client setRating(final double rating) {
        this.rating = rating;
        return this;
    }
    
    public String getName() {
        return name;
    }
    
    public Client setName(final String name) {
        this.name = name;
        return this;
    }
    
    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", rating=" + rating +
                '}';
    }
}
