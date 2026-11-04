package org.example;

public class Drill extends Tool {
    private int speed; //скорость вращения
    public Drill(String name, double power, double weight, int speed) {
        super(name, power, weight);
        this.speed = speed;
    }
    @Override
    public void use() {
        System.out.println("Сверлит отверстия");
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Скорость вращения: " + speed + " об/мин");
    }
    public void changeDrillBit() {
        System.out.println(name + ": сверло заменено");
    }
}