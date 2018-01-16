package com.sirius;


import com.sirius.taxi.Car;
import com.sirius.taxi.Ride;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class Main {
    private static final EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory("com.sirius.taxi");
    }
    
    public static void main(String[] args) throws Exception {
        printAllRides();
        factory.close();
    }
    
    private static void printAllRides() {
        final EntityManager manager = factory.createEntityManager();
        final List<Ride> result = manager.createQuery("from Ride", Ride.class).getResultList();
        for (final Ride ride : result) {
            System.out.println(ride);
        }
        manager.close();
    }
    
    private static void printAllCars() {
        final EntityManager manager = factory.createEntityManager();
        final List<Car> result = manager.createQuery("from Car", Car.class).getResultList();
        for (final Car car : result) {
            System.out.println(car);
        }
        manager.close();
    }
    
    private static void saveCar() {
        final EntityManager manager = factory.createEntityManager();
        final Car car = new Car().setId(1).setColor("grey").setPlate("A000AA00");
        manager.getTransaction().begin();
        manager.persist(car);
        manager.getTransaction().commit();
        manager.close();
    }
}
