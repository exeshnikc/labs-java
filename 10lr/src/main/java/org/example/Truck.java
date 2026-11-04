package org.example;

import java.time.LocalDate;

public class Truck implements Transportable, Maintainable {
    private String model;
    private int capacity;
    private LocalDate serviceDate;
    public Truck(String model, int capacity, LocalDate serviceDate) {
        this.model = model;
        this.capacity = capacity;
        this.serviceDate = serviceDate;
    }
    @Override
    public void transport() {
        System.out.println("Грузовик " + model + " перевозит груз.");
    }
    @Override
    public int getCapacity() {
        return capacity;
    }
    @Override
    public void maintain() {
        System.out.println("Грузовик " + model + " проходит техобслуживание.");
    }
    @Override
    public LocalDate getServiceDate() {
        return serviceDate;
    }
}
