package org.example;

public class App {
    public static void main(String[] args) {

        ResidentialBuilding home1 = new ResidentialBuilding(
                "ул. Ленина, 10", 9, 5400, 144);
        ResidentialBuilding home2 = new ResidentialBuilding(
                "ул. Гагарина, 5", 5, 3000, 80);
        ResidentialBuilding home3 = new ResidentialBuilding(
                "пр. Победы, 42", 16, 12000, 320);
        OfficeBuilding office1 = new OfficeBuilding(
                "пр. Мира, 25", 12, 8000, 40);
        OfficeBuilding office2 = new OfficeBuilding(
                "ул. Советская, 7", 6, 4500, 25);
        home1.displayInfo();
        home2.displayInfo();
        home3.displayInfo();
        office1.displayInfo();
        office2.displayInfo();
        int totalResidential = home1.calculateCapacity()
                + home2.calculateCapacity()
                + home3.calculateCapacity();
        int totalOffice = office1.calculateCapacity()
                + office2.calculateCapacity();
        System.out.println();
        System.out.println("ИТОГО");
        System.out.println("Жилые здания (3 шт.): " + totalResidential + " чел.");
        System.out.println("Офисные здания (2 шт.): " + totalOffice + " чел.");
        System.out.println("Общая вместимость: " + (totalResidential + totalOffice) + " чел.");
    }
}