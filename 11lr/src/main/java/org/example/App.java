package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("перегрузка: ");
        Device d = new Device("Generic", 100, 2020);
        d.turnOn();
        d.turnOn(150);
        d.turnOn("экономный");

        TV tv = new TV("Samsung QE55", 120, 2022, 55.0, "4K");
        System.out.println("\nTV");
        tv.turnOn();
        tv.turnOn(200);
        tv.turnOn("кино");
        tv.turnOn("игровой", 25);
        tv.switchChannel(5);
        tv.switchChannel("Discovery");

        Fridge fr = new Fridge("Bosch KGN", 300, 2021, 350, true);
        System.out.println("\nFridge");
        fr.turnOn();
        fr.turnOn(280);
        fr.turnOn("эко");
        fr.turnOn(true);
        fr.setTemperature(4);
        fr.setTemperature(-18, "морозилка");

        System.out.println("\n2.переопределение");
        Device[] devices = { d, tv, fr };
        for (Device dev : devices) {
            System.out.println(dev.model + " - класс энергоэффективности: "
                    + dev.getEnergyClass());
        }

        System.out.println("\n 3. Статический vs динамический полиморфизм");
        Device asBase = tv;
        asBase.turnOn();      //статический
        asBase.turnOn(50);
        System.out.println("asBase.getEnergyClass() = " + asBase.getEnergyClass()); //динамический

        System.out.println("\nПолиморфный printInfo()");
        for (Device dev : devices) {
            dev.printInfo();
            System.out.println();
        }
    }
}