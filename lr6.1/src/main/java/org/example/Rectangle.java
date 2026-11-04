package org.example;

public class Rectangle {
    private double width;
    private double height;
    private static String name;
    private String characteristic;

    private String getCharacteristic(){
        return characteristic;
    }
    private void setCharacteristic(){
        this.characteristic = characteristic;
    }

    public Rectangle(double width, double heignt, String characteristic){
        this(width, heignt);
        this.characteristic=characteristic;
    }

    //test test1

    public static void test(String name)
    {
        System.out.println(name);
    }

    public void test1()
    {
        System.out.println(height);
        System.out.println(width);
        System.out.println(characteristic);
    }
/*
        Rectangle r = new Rectangle (10.0, 10.0, 'Прямоугольнмик 1', 'Крутой')
        System.out.println(Rectangle.test());
        System.out.println(r.test1());
 */



























    public Rectangle(double width, double height) {
        setWidth(width);
        setHeight(height);
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        if (width > 0) {
            this.width = width;
        }
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        }
    }
    public double area() {
        return width * height;
    }
    public double perimeter() {
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return "Прямоугольник [Ширина=" + width + ", Высота=" + height + "]";
    }
}