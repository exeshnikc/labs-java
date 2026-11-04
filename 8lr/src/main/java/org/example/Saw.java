package org.example;

public class Saw extends Tool {
    private double bladeLength; //длина лезвия
    public Saw(String name, double power, double weight, double bladeLength) {
        super(name, power, weight);
        this.bladeLength = bladeLength;
    }
    @Override
    public void use() {
        System.out.println("Режет материалы");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Длина лезвия: " + bladeLength + " мм");
    }
    public void sharpenBlade() {
        System.out.println(name + ": лезвие заточено");
    }
}