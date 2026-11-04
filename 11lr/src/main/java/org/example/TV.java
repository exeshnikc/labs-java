package org.example;

public class TV extends Device {
    private double screenSize;
    private String resolution;
    public TV(String model, int power, int year, double screenSize, String resolution) {
        super(model, power, year);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }
    @Override
    public String getEnergyClass() {
        return "Высокий";
    }
    //перегруженные
    public void switchChannel(int channel) {
        System.out.println("Переключаю на канал " + channel);
    }
    public void switchChannel(String channelName) {
        System.out.println("Переключаю на канал \"" + channelName + "\"");
    }
    // Перегрузка turnOn с собственным параметром
    public void turnOn(String mode, int volume) {
        System.out.println("Включаю ТВ в режиме " + mode + " с громкостью " + volume);
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("  Экран: " + screenSize + "\", разрешение: " + resolution);
    }
}
