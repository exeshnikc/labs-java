package org.example;

public class Tool {
    protected String name;
    protected double power;
    protected double weight;
    public Tool(String name, double power, double weight) {
        this.name = name;
        this.power = power;
        this.weight = weight;
    }
    public void use() {
        System.out.println(name + ": инструмент используется");
    }
    public void displayInfo() {
        System.out.println("Название: " + name);
        System.out.println("Мощность: " + power + " Вт");
        System.out.println("Вес: " + weight + " кг");
    }
}