package com.sirius.taxi;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ride {
    @Id
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "driver")
    private Driver driver;
    @ManyToOne
    @JoinColumn(name = "client")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "car")
    private Car car;
    private long duration;
    
    
    public int getId() {
        return id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
    public Driver getDriver() {
        return driver;
    }
    
    public void setDriver(final Driver driver) {
        this.driver = driver;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(final Client client) {
        this.client = client;
    }
    
    public long getDuration() {
        return duration;
    }
    
    public void setDuration(final long duration) {
        this.duration = duration;
    }
    
    public Car getCar() {
        return car;
    }
    
    public void setCar(final Car car) {
        this.car = car;
    }
    
    @Override
    public String toString() {
        return "Ride{" +
                "id=" + id +
                ", driver=" + driver +
                ", client=" + client +
                ", car=" + car +
                ", duration=" + duration +
                '}';
    }
}
