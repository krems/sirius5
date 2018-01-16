package com.sirius.taxi;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class License {
    @Id
    private int id;
    
    public int getId() {
        return id;
    }
    
    public void setId(final int id) {
        this.id = id;
    }
    
}
