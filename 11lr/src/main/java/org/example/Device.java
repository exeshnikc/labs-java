package org.example;

public class Device {
    protected String model;
    protected int power;
    protected int year;

    public Device(String model, int power, int year) {
        this.model = model;
        this.power = power;
        this.year = year;
    }

    //перегрузка
    public void turnOn() {
        System.out.println("Включаю");
    }

    public void turnOn(int power) {
        System.out.println("Включаю на мощность " + power);
    }

    public void turnOn(String mode) {
        System.out.println("Включаю в режиме " + mode);
    }

    //метод для переопределения
    public String getEnergyClass() {
        return "Средний";
    }

    public void printInfo() {
        System.out.println("Модель: " + model + ", мощность: " + power
                + " Вт, год: " + year + ", класс: " + getEnergyClass());
    }
}
