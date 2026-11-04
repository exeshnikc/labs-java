package org.example;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {

        Truck truck = new Truck("Volvo", 10000, LocalDate.of(2025, 1, 15));
        Bicycle bike = new Bicycle("Trek");
        truck.transport();
        System.out.println("Грузоподъёмность: " + truck.getCapacity() + " кг");
        truck.maintain();
        System.out.println("Дата ТО: " + truck.getServiceDate());

        System.out.println();

        bike.transport();
        System.out.println("Вместимость: " + bike.getCapacity() + " чел.");

        System.out.println("\nTransportable");
        Transportable[] transportables = { truck, bike };
        for (Transportable t : transportables) {
            t.transport();
            System.out.println("Вместимость: " + t.getCapacity());
        }
        System.out.println("\nMaintainable");
        Maintainable[] maintainables = { truck };
        for (Maintainable m : maintainables) {
            m.maintain();
            System.out.println("Дата ТО: " + m.getServiceDate());
        }
    }
}