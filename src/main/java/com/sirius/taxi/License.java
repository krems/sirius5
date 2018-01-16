package com.sirius.taxi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class License {
    @Id
    private int id;
    private String code;
    
    public int getId() {
        return id;
    }
    
    public License setId(final int id) {
        this.id = id;
        return this;
    }
    
    public String getCode() {
        return code;
    }
    
    public License setCode(final String code) {
        this.code = code;
        return this;
    }
    
    @Override
    public String toString() {
        return "License{" +
                "id=" + id +
                ", code='" + code + '\'' +
                '}';
    }
}
