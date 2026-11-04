package org.example;

public class Bicycle implements Transportable {
    private String brand;
    public Bicycle(String brand) {
        this.brand = brand;
    }
    @Override
    public void transport() {
        System.out.println("Велосипед " + brand + " едет.");
    }
    @Override
    public int getCapacity() {
        return 1;
    }
}

