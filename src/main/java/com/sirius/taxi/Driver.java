package com.sirius.taxi;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Driver {
    @Id
    private int id;
    @OneToOne
    @JoinColumn(name = "license")
    private License license;
    
    @ManyToMany
    private Collection<Car> cars;
    
    public int getId() {
        return id;
    }
    
    public Driver setId(final int id) {
        this.id = id;
        return this;
    }
    
    public License getLicense() {
        return license;
    }
    
    public void setLicense(final License license) {
        this.license = license;
    }
    
    @Override
    public String toString() {
        return "Driver{" +
                "id=" + id +
                ", license=" + license +
                ", cars=" + cars +
                '}';
    }
}
