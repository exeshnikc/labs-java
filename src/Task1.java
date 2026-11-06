package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Task1 {
    public static void run() {
        String fileName = "favorite_song.txt";
        File file = new File(fileName);

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Название: Bohemian Rhapsody\n");
            writer.write("Исполнитель: Queen\n");
            writer.write("Год: 1975\n");
            writer.write("Альбом: A Night at the Opera\n");
            System.out.println("Файл создан.");
        } catch (IOException e) {
            System.out.println("Ошибка записи: " + e.getMessage());
            return;
        }

        System.out.println("\n--- Информация о файле ---");
        System.out.println("Имя: " + file.getName());
        System.out.println("Путь: " + file.getAbsolutePath());
        System.out.println("Размер (байт): " + file.length());

        System.out.println("\n--- Содержимое ---");
        try {
            List<String> lines = Files.readAllLines(Path.of(fileName));
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Ошибка чтения: " + e.getMessage());
        }
    }
}