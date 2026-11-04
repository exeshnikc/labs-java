package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public static void run() {
        String fileName = "f_task5.txt";

        // Создание файла со случайными числами
        try (FileWriter writer = new FileWriter(fileName)) {
            Random random = new Random();
            System.out.println("Содержимое f:");
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(101) - 50;
                writer.write(num + " ");
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        int countNegative = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNextInt()) {
                if (scanner.nextInt() < 0) {
                    countNegative++;
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }

        System.out.println("\n\nКоличество чисел меньше 0: " + countNegative);
    }
}