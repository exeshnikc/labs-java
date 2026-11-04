package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void run() {
        String fileF = "f.txt";
        String fileG = "g.txt";
        String fileH = "h.txt";

        // Создание файла f
        try (FileWriter writer = new FileWriter(fileF)) {
            Random random = new Random();
            System.out.println("Сгенерированы числа в f:");
            for (int i = 0; i < 15; i++) {
                int num = random.nextInt(200) - 100;
                writer.write(num + " ");
                System.out.print(num + " ");
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи f: " + e.getMessage());
            return;
        }

        // Распределение
        try (Scanner scanner = new Scanner(new File(fileF));
             FileWriter writerG = new FileWriter(fileG);
             FileWriter writerH = new FileWriter(fileH)) {

            System.out.println("\n\nРаспределение:");
            while (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                int sumDigits = sumOfDigits(Math.abs(num));

                if (sumDigits % 2 == 0) {
                    writerG.write(num + " ");
                    System.out.println(num + " -> g (сумма " + sumDigits + " чётная)");
                } else {
                    writerH.write(num + " ");
                    System.out.println(num + " -> h (сумма " + sumDigits + " нечётная)");
                }
            }
        } catch (IOException e) {
            System.out.println("Ошибка обработки: " + e.getMessage());
        }
    }

    private static int sumOfDigits(int n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}