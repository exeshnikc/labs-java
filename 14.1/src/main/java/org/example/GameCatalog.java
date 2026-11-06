package org.example;

import java.util.LinkedHashMap;
import java.util.Map;

public class GameCatalog {
    public static void main(String[] args) {
        Map<String, Game> games = new LinkedHashMap<>();
        games.put("Catan",       new BoardGame("Catan", 1, 4.7, 4));
        games.put("Carcassonne", new BoardGame("Carcassonne", 2, 4.5, 5));
        games.put("Chess",       new BoardGame("Chess", 3, 4.9, 2));

        // 3 карточные игры
        games.put("Poker",       new CardGame("Poker", 4, 4.3, "Standard 52"));
        games.put("Uno",         new CardGame("Uno", 5, 4.0, "Color deck"));
        games.put("Magic",       new CardGame("Magic: The Gathering", 6, 4.6, "Collectible"));

        // 2 видеоигры
        games.put("Minecraft",   new VideoGame("Minecraft", 7, 4.8, "PC"));
        games.put("FIFA",        new VideoGame("FIFA", 8, 4.1, "PlayStation"));

        // Вывод всех ключей и значений
        System.out.println("=== Все игры (ключ -> значение) ===");
        for (Map.Entry<String, Game> entry : games.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}