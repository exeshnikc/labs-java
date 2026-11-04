package org.example;

public class App {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 10.0);
        Rectangle rect2 = new Rectangle(3.5, 4.2);
        Rectangle rect3 = new Rectangle(10.0, 10.0);
        System.out.println("Прямоугольник 1:");
        System.out.println(rect1.toString());
        System.out.println("Площадь: " + rect1.area());
        System.out.println("Периметр: " + rect1.perimeter());
        System.out.println();
        System.out.println("Прямоугольник 2:");
        System.out.println("Ширина: " + rect2.getWidth() + ", Высота: " + rect2.getHeight());
        System.out.println("Площадь: " + rect2.area());
        System.out.println("Периметр: " + rect2.perimeter());
        System.out.println();
        System.out.println("Прямоугольник 3:");
        System.out.println("Ширина: " + rect3.getWidth() + ", Высота: " + rect3.getHeight());
        System.out.println("Площадь: " + rect3.area());
        System.out.println("Периметр: " + rect3.perimeter());
    }
}