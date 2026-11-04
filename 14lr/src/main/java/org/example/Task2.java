package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void run() {
        String fileName = "numbers.txt";
        Scanner scanner = new Scanner(System.in);

        try (FileWriter writer = new FileWriter(fileName)) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("Число " + (i + 1) + ": ");
                int num = scanner.nextInt();
                writer.write(num + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int countPowerOfTwo = 0;
        System.out.println("\nЧисла из файла:");

        try (Scanner fileScanner = new Scanner(new File(fileName))) {
            while (fileScanner.hasNextInt()) {
                int num = fileScanner.nextInt();
                System.out.print(num + " ");
                // Проверка на степень двойки (для положительных)
                if (num > 0 && (num & (num - 1)) == 0) {
                    countPowerOfTwo++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\nКоличество степеней двойки: " + countPowerOfTwo);
    }
}