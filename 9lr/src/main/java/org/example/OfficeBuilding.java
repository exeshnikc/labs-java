package org.example;

public class OfficeBuilding extends Building {
    private int companies;

    public OfficeBuilding(String address, int floors, double area, int companies) {
        super(address, floors, area);
        this.companies = companies;
    }
    @Override
    public String getPurpose() {
        return "Офисное здание";
    }
    @Override
    public int calculateCapacity() {
        return companies * 10; // 10 человек на компанию
    }
}