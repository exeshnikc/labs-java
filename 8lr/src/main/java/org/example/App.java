package org.example;

public class App {
    public static void main(String[] args) {
        Drill drill = new Drill("Makita 6413", 450, 1.8, 3000);
        Saw saw = new Saw("Bosch GKS 190", 1400, 4.2, 190);
        System.out.println("Дрель");
        drill.displayInfo();
        drill.use();
        drill.changeDrillBit();
        System.out.println("\nПила");
        saw.displayInfo();
        saw.use();
        saw.sharpenBlade();
    }
}