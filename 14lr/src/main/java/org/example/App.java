package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nМеню");
            System.out.println("1. Информация о любимой песне");
            System.out.println("2. 10 чисел и степени двойки");
            System.out.println("3. Случайные числа: четная/нечетная сумма цифр");
            System.out.println("4. Средний угол");
            System.out.println("5. Количество чисел меньше 0");
            System.out.println("0. Выход");
            System.out.print("Выберите задачу: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> Task1.run();
                case 2 -> Task2.run();
                case 3 -> Task3.run();
                case 4 -> Task4.run();
                case 5 -> Task5.run();
                case 0 -> {
                    System.out.println("Выход...");
                    return;
                }
                default -> System.out.println("Неверный выбор.");
            }
        }
    }
}