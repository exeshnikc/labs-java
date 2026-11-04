package org.example;

public abstract class Building {
    protected String address;
    protected int floors;
    protected double area;
    public Building(String address, int floors, double area) {
        this.address = address;
        this.floors = floors;
        this.area = area;
    }
    public abstract String getPurpose();// назначение
    public abstract int calculateCapacity();// вместимость
    public void displayInfo() {
        System.out.println(getPurpose());
        System.out.println("Адрес: " + address);
        System.out.println("Этажей: " + floors);
        System.out.println("Площадь: " + area + " м^2");
        System.out.println("Вместимость: " + calculateCapacity() + " чел.");
    }
}