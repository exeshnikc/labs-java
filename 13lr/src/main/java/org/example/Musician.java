package org.example;

import java.util.ArrayList;
import java.util.List;

public class Musician {
    String name;
    String instrument;
    String genre;
    List<String> albums;
    double rating;

    public Musician(String name, String instrument, String genre, int albumCount, double rating)
            throws InvalidMusicianDataException {

        if (albumCount < 0) {
            throw new InvalidMusicianDataException("Количество альбомов не может быть меньше 0");
        }
        if (rating < 1 || rating > 10) {
            throw new InvalidMusicianDataException("Рейтинг должен быть от 1 до 10");
        }

        this.name = name;
        this.instrument = instrument;
        this.genre = genre;
        this.albums = new ArrayList<>();
        for (int i = 0; i < albumCount; i++) {
            this.albums.add("Альбом " + (i + 1));
        }
        this.rating = rating;
    }

    public void releaseAlbum(String title) throws AlbumException {
        if (title == null || title.trim().isEmpty()) {
            throw new AlbumException("Название альбома не может быть пустым");
        }
        albums.add(title);
        System.out.println("Музыкант " + name + " выпустил альбом: " + title);
    }

    public void updateRating(double newRating) throws InvalidMusicianDataException {
        if (newRating < 1 || newRating > 10) {
            throw new InvalidMusicianDataException("Новый рейтинг должен быть от 1 до 10");
        }
        rating = newRating;
        System.out.println("Рейтинг " + name + " обновлён до " + newRating);
    }

    public String toString() {
        return name + " (" + instrument + ", " + genre + "), рейтинг: " + rating + ", альбомов: " + albums.size();
    }
}