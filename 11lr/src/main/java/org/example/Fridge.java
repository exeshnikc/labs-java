package org.example;

public class Fridge extends Device {
    private int volume;// литры
    private boolean noFrost;
    public Fridge(String model, int power, int year, int volume, boolean noFrost) {
        super(model, power, year);
        this.volume = volume;
        this.noFrost = noFrost;
    }
    @Override
    public String getEnergyClass() {
        return "Низкий";
    }
    //перегруженные
    public void setTemperature(int temp) {
        System.out.println("Устанавливаю температуру " + temp + "°C");
    }
    public void setTemperature(int temp, String zone) {
        System.out.println("Устанавливаю температуру " + temp + "°C в зоне " + zone);
    }
    public void turnOn(boolean quickFreeze) {
        System.out.println("Включаю холодильник" + (quickFreeze ? " (быстрая заморозка)" : ""));
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("  Объём: " + volume + " л, NoFrost: " + noFrost);
    }
}
