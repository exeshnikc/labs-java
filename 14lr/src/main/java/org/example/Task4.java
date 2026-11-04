package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task4 {
    public static void run() {
        String fileName = "angles.txt";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 10 углов в градусах:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Угол " + (i + 1) + ": ");
                double angle = scanner.nextDouble();
                writer.write(angle + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        double sum = 0;
        int count = 0;

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
            return;
        }

        if (count > 0) {
            System.out.printf("\nСредний угол: %.2f градусов%n", sum / count);
        } else {
            System.out.println("Нет данных.");
        }
    }
}