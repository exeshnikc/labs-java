package org.example;

public class Singer {
    private String name;
    private String genre;
    private int albums;
    private static int totalSingers = 0;
    private static int totalAlbums = 0;
    public Singer(String name, String genre, int albums) {
        this.name = name;
        this.genre = genre;
        this.albums = albums;
        totalSingers++;
        totalAlbums += albums;
    }
    public static double getAverageAlbums() {
        if (totalSingers == 0) {
            return 0;
        }
        return (double) totalAlbums / totalSingers;
    }
    public String getName() {
        return name;
    }
    public String getGenre() {
        return genre;
    }
    public int getAlbums() {
        return albums;
    }
    public static int getTotalSingers() {
        return totalSingers;
    }
    public static int getTotalAlbums() {
        return totalAlbums;
    }
}